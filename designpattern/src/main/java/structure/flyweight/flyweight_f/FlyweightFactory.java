package structure.flyweight.flyweight_f;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ronin
 * @version V1.0
 * @desc 为享元工厂增加引用计数和垃圾回收功能
 * @since 2019/8/1 17:03
 */
public class FlyweightFactory {

    /**
     * 饿汉式单例
     */
    private static final FlyweightFactory factory = new FlyweightFactory();

    /**
     * 私有化构造方法
     */
    private FlyweightFactory(){
        //启动清除缓存值的线程
        Thread cleaner = new ClearCache();
        cleaner.start();
    }

    /**
     * 获取单例的享元工厂实例
     * @return
     */
    public static FlyweightFactory getInstance(){
        return factory;
    }

    /**
     * 缓存多个flyweight对象
     */
    private Map<String,Flyweight> flyweightMap = new HashMap<>();

    /**
     * 用来缓存被共享对象的缓存配置，key值和上面map的一样
     */
    private Map<String,CacheConfModel> cacheConfMap = new HashMap<>();

    /**
     * 用来记录缓存对象被引用的次数，key值和上面map的一样
     */
    private Map<String,Integer> countMap =  new HashMap<>();

    /**
     * 默认保存6秒钟，主要为了测试方便，这个时间可以根据应用的要求设置
     */
    private final long DURABLE_TIME = 6*1000L;

    /**
     * 获取某个享元被使用的次数
     * @param key 享元的key
     * @return 被使用的次数
     */
    public synchronized int getUseTimes(String key){
        Integer count = countMap.get(key);
        if(count==null){
            count = 0;
        }
        return count;
    }

    /**
     * 获取key对应的享元对象
     * @param key 获取享元对象的key
     * @return key对应的享元对象
     */
    public synchronized Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweightMap.get(key);
        if(flyweight == null){
            flyweight = new AuthorizationFlyweight(key);
            flyweightMap.put(key,flyweight);
            //同时设置引用计数
            countMap.put(key, 1);
            //同时设置缓存配置数据
            CacheConfModel cm = new CacheConfModel();
            cm.setBeginTime(System.currentTimeMillis());
            cm.setForever(false);
            cm.setDurableTime(DURABLE_TIME);

            cacheConfMap.put(key, cm);
        }else{
            //表示还在使用，那么应该重新设置缓存配置
            CacheConfModel cacheConfModel = cacheConfMap.get(key);
            cacheConfModel.setBeginTime(System.currentTimeMillis());
            //设置回去
            this.cacheConfMap.put(key, cacheConfModel);
            //同时计数加1
            Integer count = countMap.get(key);
            count++;
            countMap.put(key, count);
        }
        return flyweight;
    }

    /**
     * 删除key对应的享元对象，连带清除对应的缓存配置和引用次数的记录，不对外
     * @param key 要删除的享元对象的key
     */
    private synchronized void removeFlyweight(String key){
        //根据键删除对应的享元对象
        this.flyweightMap.remove(key);
        //根据键删除保存享元对象状态的缓存配置对象
        this.cacheConfMap.remove(key);
        //根据键删除引用计数器中与该key对应的数据
        this.countMap.remove(key);
    }
    
    /**
     * 维护清除缓存的线程，内部使用
     */
    private  class ClearCache extends Thread{
        @Override
        public void run(){
            while(true){
                Set<String> tempSet = new HashSet<>();
                Set<String> set = cacheConfMap.keySet();
                for(String key : set){
                    CacheConfModel ccm = cacheConfMap.get(key);
                    //比较是否需要清除
                    if((System.currentTimeMillis()- ccm.getBeginTime())>= ccm.getDurableTime()){
                        //可以清除，先记录下来
                        tempSet.add(key);
                    }
                }
                //真正清除
                for(String key : tempSet){
                    FlyweightFactory.getInstance().removeFlyweight(key);
                }

                System.out.println("当前享元池中对象的个数="+flyweightMap.size()+",flyweightMap=="+flyweightMap.keySet());

                //休息1秒再重新判断
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
