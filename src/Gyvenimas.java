import client.render.BaseScene;
import client.render.LoginScene;
import client.render.SceneManager;
import client.render.Window;
import static shared.engine.constants.*;

import java.awt.*;
import java.io.IOException;
import java.util.TimerTask;

public class Gyvenimas {

    public static void main(String[] args) throws IOException {
        Window win = new Window("Project A",WINDOW_WIDTH,WINDOW_HEIGHT);
        SceneManager sceneManager = new SceneManager();
        LoginScene loginScene = new LoginScene();

        win.getContentPane().add(loginScene);
        java.util.Timer t = new java.util.Timer();


        t.schedule(new TimerTask() {
            @Override
            public void run() {
                SceneManager.draw();
            }
        },0,10);


        //System.out.println("("+Color.pink.getRed()+","+Color.pink.getGreen()+","+Color.pink.getBlue()+")");
    }

    public static int randint(int a, int b){
        return (int) (Math.random()*(b-a)) + a;
    }
}
