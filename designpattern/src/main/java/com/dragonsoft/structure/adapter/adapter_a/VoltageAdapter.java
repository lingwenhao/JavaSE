package com.dragonsoft.structure.adapter.adapter_a;

/**
 * 电源适配器
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        System.out.println("类适配器......");
        int voltageSrc = output220V();
        System.out.println("获取到"+voltageSrc+"V电压");
        int voltageDst = voltageSrc / 44;
        System.out.println("将"+voltageSrc+"转换为"+voltageDst+"V电压");
        return voltageDst;
    }
}
