/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libraries;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;


/**
 *
 * @author surya
 */
public class Images extends Canvas{
    private Image backgroundImage;

    public static ImageIcon ResizeImages(ImageIcon Path, int width, int height){
        Image originalImages = Path.getImage();
        Image resizedImages = originalImages.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        return new ImageIcon(resizedImages);
    }
    
    public Images(String url) {
        backgroundImage = Toolkit.getDefaultToolkit().getImage(url);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(backgroundImage.getWidth(this), backgroundImage.getHeight(this));
    }
}
