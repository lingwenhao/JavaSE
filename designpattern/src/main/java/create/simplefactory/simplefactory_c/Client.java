package create.simplefactory.simplefactory_c;

public class Client {
    public static void main(String[] args) {
        Operation add = OperationFactory.createOperation("+");
        System.out.println(add.getReslt(1.0, 3.5));
    }
}
