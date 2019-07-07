package com.dragonsoft.test;

import java.sql.*;

/**
 * @author ronin
 * @version V1.0
 * @description
 * @class HsqldbTest
 * @date 2019/6/20 16:08
 */
public class HsqldbTest {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:hsqldb", "root", "root");
            Statement stat = conn.createStatement();
            //建表
            stat.executeUpdate("create table mytable(id integer, value VARCHAR(512), createtime TIMESTAMP default now())");

            //插入数据
            stat.executeUpdate("insert into mytable (id,value) values(1,'hello world'),(2,'java')");
            stat.executeUpdate("insert into mytable values(3,'abcd',now())");

            //查询
            int x = 3;
            PreparedStatement preparedStatement = conn.prepareStatement("select * from mytable where id = ?");
            preparedStatement.setInt(1, x);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                String s = resultSet.getInt(1)+">"+resultSet.getString(2)+">"+resultSet.getDate("createtime")+" "+resultSet.getTime("createtime");
                System.out.println(s);
            }

            //修改
            PreparedStatement preparedStatement2 = conn.prepareStatement("update mytable set value = ? where id = ?");
            preparedStatement2.setString(1, "hsqldb");
            preparedStatement2.setInt(2, 3);
            int updateResult = preparedStatement2.executeUpdate();
            System.out.println("update : "+updateResult);

            //查询列表
            PreparedStatement preState = conn.prepareStatement("select * from mytable");
            boolean result = preState.execute();
            if(result) {
                ResultSet resultset = preState.getResultSet();
                while(resultset.next()) {
                    int id = resultset.getInt("id");
                    String value = resultset.getString("value");
                    Date d = resultset.getDate("createtime");
                    String time = resultset.getTime("createtime").toString();
                    System.out.println("id="+id+";val="+value+";date="+d+" time="+time);
                }
            }

            //删除
            PreparedStatement preState2 = conn.prepareStatement("delete from mytable where id = ?");
            preState2.setInt(1, x);
            int deleteResult = preState2.executeUpdate();
            System.out.println("delete : "+deleteResult);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
