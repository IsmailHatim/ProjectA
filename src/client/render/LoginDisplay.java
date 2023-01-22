package client.render;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class LoginDisplay extends JPanel {
    private StaticSprite background;
    private Button connectButton;
    private Point vbackground = new Point(0,0);
    public ArrayList<JComponent> listComponents = new ArrayList<>();


    public LoginDisplay() throws IOException {
        this.background = new StaticSprite("portal.png", vbackground);
        this.add(background);
        listComponents.add(0,background);
    }

    public void update(Graphics g){
        for(var jComponent : listComponents){
            jComponent.update(g);
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(var jComponent : listComponents){
            jComponent.paint(g);
        }
    }

    @Override
    public String toString(){
        return String.valueOf(listComponents.size());
    }

}
