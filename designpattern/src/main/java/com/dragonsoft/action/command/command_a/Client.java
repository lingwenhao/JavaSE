package com.dragonsoft.action.command.command_a;

public class Client {
    public static void main(String[] args) {
        //使用命令模式，完成使用遥控器操作电灯的操作
        LightReceeiver lightReceeiver = new LightReceeiver();
        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceeiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceeiver);

        //创建遥控器
        RemoteContoller remoteContoller = new RemoteContoller();
        //no=0是电灯的开和关的操作
        remoteContoller.setOnCmmand(0,lightOnCommand,lightOffCommand);
        //开灯
        remoteContoller.onButtonWasPush(0);
        //关灯
        remoteContoller.offButtonWasPush(0);
        //撤销关灯操作
        remoteContoller.undoButtonWasPush();

        System.out.println("-----------------------------------------------");
        TvReceiver tvReceiver = new TvReceiver();
        TvOnCommand tvOnCommand = new TvOnCommand(tvReceiver);
        TvOffCommand tvOffCommand = new TvOffCommand(tvReceiver);

        //no=1是电视机的开和关的操作
        remoteContoller.setOnCmmand(1,tvOnCommand,tvOffCommand);
        remoteContoller.onButtonWasPush(1);
        remoteContoller.offButtonWasPush(1);
        remoteContoller.undoButtonWasPush();
    }
}
