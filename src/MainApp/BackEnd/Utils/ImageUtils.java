/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.BackEnd.Utils;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author NghiaDTSE05330
 */
public class ImageUtils {

    public static ImageIcon getScaledIco(String url, int width, int height) {
        BufferedImage img = null;

        try {
            img = ImageIO.read(MainApp.MainApplication.class.getResourceAsStream(url));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Image dimg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        return imageIcon;
    }
}
