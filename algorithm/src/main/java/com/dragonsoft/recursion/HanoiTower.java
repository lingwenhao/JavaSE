/**  
 * @Title: HanoiTower.java  
 * @Package com.dragonsoft.recursion  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年4月1日  
 * @version V1.0  
 */ 
package com.dragonsoft.recursion;

/**  
 * @ClassName: HanoiTower  
 * @Description: TODO(汉诺塔问题)  
 * @author ronin  
 * @date 2019年4月1日  
 *    
 */
public class HanoiTower {
    public static void main(String[] args) {
//    	HanoiTower hanoiTower = new HanoiTower();
//    	hanoiTower.hanoi(3, 'A', 'B', 'C');
    	hanoi(3,'A','B','C');
    }
	
	/**
	    * 
	    * @param n 盘子的数目
	    * @param origin 源座
	    * @param assist 辅助座
	    * @param destination 目的座
	    */
//	    public void hanoi(int n, char origin, char assist, char destination) {
//	        if (n == 1) {
//	            move(origin, destination);
//	        } else {
//	            hanoi(n - 1, origin, destination, assist);
//	            move(origin, destination);
//	            hanoi(n - 1, assist, origin, destination);
//	        }
//	    }
	 
	    // Print the route of the movement
	    private void move(char origin, char destination) {
	        System.out.println("Direction:" + origin + "--->" + destination);
	    }
	 
	    /**
	     * @Title: hanoi  
	     * @Description: TODO(这里用一句话描述这个方法的作用)  
	     * @param n 共有n个盘子
	     * @param from 开始的盘子
	     * @param in 中间的盘子
	     * @param to 目标盘子
	     * @return void
	     * @throws
	     */
	    public static void hanoi(int n,char from,char in,char to){
	    	if(n ==1) {
	    		System.out.println("第1个盘子:"+from+"--->"+to);
	    	//无论有多少个盘子，都认为只有两个盘子，上面所有盘子和最下面一个
	    	}else{
	    		//移动所有盘子到中间位置
	    		hanoi(n-1, from, to, in);
	    		//移动下面的盘子
	    		System.out.println("第"+n+"个盘子:"+from+"--->"+to);
	    		//把上面所有盘子从中间位置移动到目标位置
	    		hanoi(n-1, in, from, to);
	    		//System.out.println("第"+n+"个盘子:"+from+"--->"+to);
	    	}
	    }
}
