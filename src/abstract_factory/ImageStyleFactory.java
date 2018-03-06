package abstract_factory;

public class ImageStyleFactory extends IStyleFactory {

    @Override
    public IButton createButton() {
        return new ImageButton();
    }

    @Override
    public ITextView createTextView() {
        return new ImageTextView();
    }
}
