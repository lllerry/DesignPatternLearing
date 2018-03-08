package prototype.prototype_advance;

public class FAR implements OfficalDocument {

    @Override
    public OfficalDocument clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (OfficalDocument) object;
    }

    @Override
    public void display() {
        System.out.println("可行性分析报告");
    }
}
