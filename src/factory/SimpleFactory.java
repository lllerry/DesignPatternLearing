package factory;


public class SimpleFactory {

    //生成产品对象
    public static IProduct create(int type) {
        IProduct product;
        switch (type) {
            case 1:
                product = new ProductA();
                break;
            case 2:
                product = new ProductB();
                break;
            default:
                product = new ProductA();
                break;

        }
        return product;
    }
}
