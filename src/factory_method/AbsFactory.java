package factory_method;

public abstract class AbsFactory {

    abstract IProduct createProduct();

    public void operate() {
        IProduct product = createProduct();
        product.draw();
    }
}
