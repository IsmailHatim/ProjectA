package client.render;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Text extends JComponent {
    private String text;
    private Font font;
    private int textSize;
    private Point position;
    private Label textTodraw;

    public Text(){
        super();
        this.text = "Undefined";
    }

    public Text(String text, Point position){
        super();
        this.font = new Font("Impact.ttf", Font.BOLD, textSize);
        this.text = text;
        this.position = position;
        textTodraw = new Label(text);
        textTodraw.setFont(font);
        textTodraw.setLocation(position);
    }

    public void setPosition(Point position){
        this.position = position;
    }

    public Point getPosition(){
        return this.position;
    }

    public void setTextSize(int textSize){
        this.textSize = textSize;
    }

    public int getTextSize(){
        return this.textSize;
    }

    public void setText(String text){
        this.text = text;
    }

    public Label getTextTodraw(){
        return this.textTodraw;
    }

    public void setColor(Color color){
        this.textTodraw.setBackground(color);
    }


}
