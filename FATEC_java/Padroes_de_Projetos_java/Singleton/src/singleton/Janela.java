
package singleton;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class Janela extends JFrame{
    
    private static Janela j = null;
    
    public Janela() {
        setPreferredSize(new Dimension(640, 480));
        
    }
    public static Janela getInstance() {
        if (j == null) {            
            j = new Janela();
        }
        return j;
    }
    
}
