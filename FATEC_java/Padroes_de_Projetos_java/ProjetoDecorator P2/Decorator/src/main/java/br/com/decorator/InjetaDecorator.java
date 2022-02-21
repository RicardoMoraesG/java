package br.com.decorator;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author rodrigo
 */
@Named
@ViewScoped
public class InjetaDecorator {
    @Inject
    Produto prod;
    
    public void retornaDecorator(){
        prod.geraLabel();
    }
    
}
