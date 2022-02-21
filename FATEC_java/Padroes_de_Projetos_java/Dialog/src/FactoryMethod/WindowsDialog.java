package FactoryMethod;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        Button windowsButton = new WindowsButton("vermelho", "quadrado", "sombra");
        return windowsButton;
    }
}
