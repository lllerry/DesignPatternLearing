package factory_method;

public class IOSFactory extends AbsFactory {

    @Override
    IProduct createProduct() {
        return new IOSProduct();
    }
}
