package prototype;

public class ContretePrototype2 implements Cloneable {

    public IPrototype clone() {

        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (IPrototype) object;
    }
}
