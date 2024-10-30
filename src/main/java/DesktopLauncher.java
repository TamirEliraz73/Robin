import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.core.base.game.BaseGame;

public class DesktopLauncher {
    public static void main(String[] args) {
        new LwjglApplication(new BaseGame());
    }
}
