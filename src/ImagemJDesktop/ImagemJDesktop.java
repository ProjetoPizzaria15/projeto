/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImagemJDesktop;

import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.Toolkit;  
import javax.swing.JDesktopPane;  

/**
 *
 * @author Paulo
 */
public class ImagemJDesktop extends JDesktopPane {
    

    private static final long serialVersionUID = 1L;  
    Image imagem;  
  
    public ImagemJDesktop(String caminho) {  
        imagem = Toolkit.getDefaultToolkit().getImage(  
                getClass().getResource(caminho));  
    }  
  
    public void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        if(imagem != null)  {  
            g.drawImage(imagem, 0, 0, this.getWidth(), this.getHeight(), this);   
        }  
    }  
  
}  