import factory_method.AbsFactory;
import factory_method.AndroidFactory;
import factory_method.IOSFactory;
import org.junit.Test;
import simple_factory.IProduct;
import simple_factory.SimpleFactory;

public class Main {

    /**
     * 工厂方法模式
     */
    @Test
    public void factory_method() {
        AbsFactory factory;

        factory = new AndroidFactory();
        factory.operate();

        factory = new IOSFactory();
        factory.operate();
    }

    /**
     * 简单工厂模式
     */
    @Test
    public void simple_factory() {
        IProduct product_1 = SimpleFactory.create(1);

        IProduct product_2 = SimpleFactory.create(2);
    }
}
