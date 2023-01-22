package client.render;

import com.sun.tools.javac.Main;

import java.awt.*;
import java.io.IOException;

public class SceneManager {
    private static LoginScene loginScene;
    private static CharacterCreationScene characterCreationScene;
    private static MainScene mainScene;
    private static SceneID currentScene;

    public SceneManager() throws IOException {
        loginScene = new LoginScene();
        characterCreationScene = new CharacterCreationScene();
        mainScene = new MainScene();
        currentScene = SceneID.LOGIN_VIEW;
    }

    public static void update(Graphics g){
        if (currentScene == SceneID.LOGIN_VIEW){
            loginScene.update(g);
        }

        if (currentScene == SceneID.CHARACTER_CREATION_VIEW){
            characterCreationScene.update(g);
        }

        if (currentScene == SceneID.MAIN_VIEW){
            mainScene.update(g);
        }

    }

    public static void draw(){
        if (currentScene == SceneID.LOGIN_VIEW){
            loginScene.repaint();
        }
    }

}
