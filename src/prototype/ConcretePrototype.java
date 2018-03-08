package prototype;

public class ConcretePrototype implements IPrototype {
    private String attr;

    public IPrototype clone() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAttr("hello");
        return prototype;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }
}
