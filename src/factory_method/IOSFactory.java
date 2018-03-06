package factory_method;

public class IOSFactory extends AbsFactory {

    @Override
    protected IProduct createProduct() {
        return new IOSProduct();
    }
}
