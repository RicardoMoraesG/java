/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Usuario
 */
public class HTMLButton implements Button {

    private String color;
    private String formato;
    private String efeito;
    private String icone;

    public HTMLButton(String color, String formato, String efeito, String icone) {
        this.color = color;
        this.formato = formato;
        this.efeito = efeito;
        this.icone = icone;
    }

    @Override
    public void render() {
        Button okButton = new HTMLButton("azul", "circular", "ondas", "+");
        okButton.onClick();
    }

    @Override
    public void onClick() {
        System.out.println("HTML: "
                + this.color + ", "
                + this.formato + ", "
                + this.efeito + ", ícone: "
                + this.icone
        );
    }
}
