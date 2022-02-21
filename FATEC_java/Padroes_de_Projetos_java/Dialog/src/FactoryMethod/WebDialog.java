package FactoryMethod;

public class WebDialog extends Dialog {

    @Override
    public Button createButton() {
        Button htmlButton = new HTMLButton("laranja", "circular", "ondas", "-");
        return htmlButton;
    }
}
