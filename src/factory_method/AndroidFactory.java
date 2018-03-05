package factory_method;

public class AndroidFactory extends AbsFactory {

    @Override
    IProduct createProduct() {
        return new AndroidProduct();
    }
}
