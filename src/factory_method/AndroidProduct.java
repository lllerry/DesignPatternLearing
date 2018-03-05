package factory_method;

public class AndroidProduct implements IProduct {

    @Override
    public void draw() {
        System.out.println("AndroidProduct");
    }
}
