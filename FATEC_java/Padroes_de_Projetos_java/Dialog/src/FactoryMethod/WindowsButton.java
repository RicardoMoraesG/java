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
public class WindowsButton implements Button {

    private String color;
    private String formato;
    private String efeito;

    public WindowsButton(String color, String formato, String efeito) {
        this.color = color;
        this.formato = formato;
        this.efeito = efeito;
    }

    @Override
    public void render() {
        Button okButton = new WindowsButton("cinza", "retangular", "brilho");
        okButton.onClick();
    }

    @Override
    public void onClick() {
        System.out.println("WINDOWS: "
                + this.color + ", "
                + this.formato + ", "
                + this.efeito
        );
    }

}
