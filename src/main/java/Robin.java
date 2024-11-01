import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.core.base.group.BaseBodyPart;
import com.core.base.group.BaseGroup;

public class Robin extends BaseGroup {
    public Robin(float x, float y, Stage stage, InputMultiplexer multiplexer) {
        super(x, y, stage, multiplexer);
    }
    
    @Override
    protected BaseBodyPart[] values() {
        return RobinBodyParts.values();
    }
    
    
    @Override
    public boolean keyDown(int keycode) {
        switch (keycode) {
            case Input.Keys.H -> switchBodyPartVisibility(RobinBodyParts.HAT);
        }
        return false;
    }
}
