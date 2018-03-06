package builder;

public abstract class Builder {

    protected Product product = new Product();

    abstract String buildPartA();

    abstract String buildPartB();

    abstract String buildPartC();

    public Product build() {
        return product;
    }
}
