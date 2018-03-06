package simple_factory;

/**
 * 产品类
 */
public abstract class Product_Optimize {

    //工厂方法 创建产品
    public static Product_Optimize create(int type) {
        Product_Optimize product;
        switch (type) {
            case 1:
                product = new HistormChart();
            case 2:
                product = new LineChart();
            default:
                product = new HistormChart();
        }
        return product;
    }

    public abstract void display();
}
