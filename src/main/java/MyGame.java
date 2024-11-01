import com.badlogic.gdx.InputMultiplexer;
import com.core.base.game.BaseGame;

public class MyGame extends BaseGame {
    private InputMultiplexer inputMultiplexer;
    
    @Override
    public void create() {
        super.create();
        inputMultiplexer = new InputMultiplexer();
        addActor(new Robin(50, 50, getStage(), inputMultiplexer));
//        Gdx.input.setInputProcessor(inputMultiplexer);
    }
}
