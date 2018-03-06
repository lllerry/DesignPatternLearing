package builder;

/**
 * 具体的建造者
 */
public class ConcreteBuilder extends Builder {

    @Override
    String buildPartA() {
        return product.partA = "partA";
    }

    @Override
    String buildPartB() {
        return product.partB = "partB";
    }

    @Override
    String buildPartC() {
        return product.partC = "partC";
    }
}
