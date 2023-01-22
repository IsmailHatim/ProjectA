package client.render;

import java.awt.*;
import java.io.IOException;

public class LoginScene extends BaseScene {
    LoginDisplay loginDisplay;


    public LoginScene() throws IOException {
        super();
        this.loginDisplay = new LoginDisplay();
        this.add(loginDisplay);
    }

    public void update(Graphics g){
        this.loginDisplay.update(g);
    }

    public void paintComponents(Graphics g){
        super.paintComponent(g);
        this.loginDisplay.paintComponent(g);
    }

    public LoginDisplay getLoginDisplay(){
        return this.loginDisplay;
    }

}
