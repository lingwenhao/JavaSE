package com.dragonsoft.action.template.template_a;

public class Client {
    public static void main(String[] args) {
        //制作红豆豆浆
        SoyaMilk readbeanSoyaMilk = new ReadbeanSoyaMilk();
        readbeanSoyaMilk.make();

        System.out.println("---------------------------");
        //制作花生豆浆
        SoyaMilk pennutSoyaMilk = new PennutSoyaMilk();
        pennutSoyaMilk.make();
    }
}
