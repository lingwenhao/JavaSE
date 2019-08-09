package com.dragonsoft.webservice;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ronin
 */
public class Test {
    public static Map<String,String> doRequestWS(URL url, String request) {
        HttpURLConnection connection = null;
        String rspMsg = "";
        String rspCode = "ERROR";
        try {
            byte[] requestBuf = (byte[]) null;
            requestBuf = request.getBytes("gbk");

            connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.setUseCaches(false);
            connection.setRequestProperty("Content-Type", "text/plain");
            connection.connect();

            DataOutputStream out = new DataOutputStream(
                    connection.getOutputStream());
            out.write(requestBuf);
            out.flush();
            out.close();

            if (connection.getResponseCode() != 200) {
                System.out.println("ERROR: " + connection.getResponseMessage());
            }

            InputStream in = connection.getInputStream();
            ByteArrayOutputStream bufOut = new ByteArrayOutputStream();
            byte[] readBuf = new byte[100];
            while (true) {
                int ret = in.read(readBuf);
                if (ret < 0) {
                    break;
                }
                bufOut.write(readBuf, 0, ret);
            }
            byte[] rspBuf = bufOut.toByteArray();

            rspMsg = new String(rspBuf, "gbk");
            rspCode = connection.getResponseMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }

        connection = null;
        Map<String,String> map = new HashMap<>();
        map.put("rspCode", rspCode);
        map.put("rspMsg", rspMsg);
        return map;
    }

    public static void main(String[] args) throws Exception,
            UnsupportedEncodingException {
        URL url = new URL("http://172.168.27.154:8081/cxfdemo?wsdl");

        Map<String,String> map =doRequestWS(
                url,
                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ws=\"http://ws.com/\">"
                        + "<soapenv:Header/>"
                        + "<soapenv:Body>"
                        + "<catt:hello>"
                        + "<arg0>李四</arg0>"
                        + "</catt:hello>"
                        + "</soapenv:Body>"
                        + "</soapenv:Envelope>");
        System.out.println(map);
    }
}
