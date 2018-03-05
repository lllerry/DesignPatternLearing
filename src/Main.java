import factory.IProduct;
import factory.SimpleFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        simple_factory();

    }

    /**
     * 简单工厂模式
     */
    private static void simple_factory() {
        IProduct product_1 = SimpleFactory.create(1);

        IProduct product_2 = SimpleFactory.create(2);
    }
}
