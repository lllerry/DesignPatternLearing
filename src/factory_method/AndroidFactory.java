package factory_method;


public class AndroidFactory extends AbsFactory {

    @Override
    protected IProduct createProduct() {
        return new AndroidProduct();
    }
}
