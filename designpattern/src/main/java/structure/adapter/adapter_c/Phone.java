package structure.adapter.adapter_c;

public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5) {
            System.out.println("5V，可以充电......");
        }else if(iVoltage5V.output5V() == 220){
            System.out.println("220V，不可以充电......");
        }

    }
}
