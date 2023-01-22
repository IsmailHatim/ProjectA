package client.render;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static shared.engine.constants.*;


public class StaticSprite extends JComponent{
    private String filename;
    private Point size;
    private Point position;
    private Image image;


    public StaticSprite(){
        super();
    }

    public StaticSprite(String filename, Point position) throws IOException{
        super();
        this.filename = filename;
        this.position = position;
        this.image = new ImageIcon(RESSOURCES_PATH + filename).getImage();
    }

    public StaticSprite(String filename, Point position, Point size) throws IOException{
        super();
        this.filename = filename;
        this.position = position;
        this.size = size;
        this.image = new ImageIcon(RESSOURCES_PATH + filename).getImage();


    }


    public void paint(Graphics g){
        g.drawImage(this.image, position.x, position.y, this);
    }
    @Override
    public void update(Graphics g){

    }

    @Override
    public String toString(){
        return filename;
    }
}
