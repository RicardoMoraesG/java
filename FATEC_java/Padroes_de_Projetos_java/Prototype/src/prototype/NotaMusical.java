/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Usuario
 */
public abstract class NotaMusical implements Cloneable {
    
    public NotaMusical metodoClone(){
        Object objetoClone = null;
        try {
           ObjetoClone = super.clone();
        } catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return(notaMusical)objetoClone;
    }
}
