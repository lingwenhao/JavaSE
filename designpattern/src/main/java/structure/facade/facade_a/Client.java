package structure.facade.facade_a;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //不直接调用各个对象，通过外观类调用子对象
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        System.out.println("--------------------------------");
        homeTheaterFacade.read();
        System.out.println("--------------------------------");
        homeTheaterFacade.play();
        System.out.println("--------------------------------");
        homeTheaterFacade.puse();
        System.out.println("--------------------------------");
        homeTheaterFacade.end();
        System.out.println("-------------------------------- ");
    }
}
