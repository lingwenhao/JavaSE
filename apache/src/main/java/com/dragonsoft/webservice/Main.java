package com.dragonsoft.webservice;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author ronin
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        get("15291183358","");
        get1();
    }
    public static void get(String mobileCode ,String userID ) throws Exception{
       String src = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx/getMobileCodeInfo?mobileCode="+mobileCode+"&userID="+userID;
        URL url=new URL(src);
        HttpURLConnection conn=(HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(5000);
        conn.setRequestMethod("GET");
        if(conn.getResponseCode()==HttpURLConnection.HTTP_OK){ //结果码=200
            InputStream is=conn.getInputStream();
            //内存流 ，
            ByteArrayOutputStream boas=new ByteArrayOutputStream();
            byte[] buffer=new byte[1024];
            int len=-1;
            while((len=is.read(buffer))!=-1){
                boas.write(buffer, 0, len);
            }
            System.out.println("GET请求获取的数据:"+boas.toString());
            boas.close();
            is.close();
        }
    }
    public static void get1() throws Exception{
        QqOnlineWebServiceSoap ws = new QqOnlineWebService().getPort(QqOnlineWebServiceSoap.class);
        String qq = "1458687169";
        String result = ws.qqCheckOnline(qq);
        System.out.println(result);
        // String，Y = 在线；N = 离线；E = QQ号码错误；A = 商业用户验证失败；V = 免费用户超过数量
        if ("Y".equalsIgnoreCase(result)) {
            result = "在线";
        } else if ("N".equalsIgnoreCase(result)) {
            result = "离线";
        } else if ("E".equalsIgnoreCase(result)) {
            result = "QQ号码错误";
        } else if ("A".equalsIgnoreCase(result)) {
            result = "商业用户验证失败";
        } else if ("V".equalsIgnoreCase(result)) {
            result = "免费用户超过数量";

        }
        System.out.println(result);
    }

}
