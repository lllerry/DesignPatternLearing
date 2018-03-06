package abstract_factory;

/**
 * 产品族工厂
 */
public abstract class IStyleFactory {
    abstract IButton createButton();

    abstract ITextView createTextView();
}
