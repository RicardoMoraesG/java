package br.com.decorator;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author rodrigo
 */
@ViewScoped
@Named
@ManagedBean
public class ProdutoBean implements Serializable {

    Produto mesa = new MesaJantar();

    @Inject
    Produto prod;

    public void novo() {
        mesa = new MesaJantar();
        System.out.println(" " + mesa.geraLabel());
    }
    
    public void testaDecorator(){
        prod.geraLabel();
        System.out.println(" " + prod.geraLabel());
    }
    
    public Produto getMesa() {
        return mesa;
    }

    public void setMesa(MesaJantar mesa) {
        this.mesa = mesa;
    }
}
