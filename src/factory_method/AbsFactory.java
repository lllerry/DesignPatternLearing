package factory_method;

public abstract class AbsFactory {

    protected abstract IProduct createProduct();

    public void draw() {
        IProduct product = createProduct();
        product.draw();
    }
}
