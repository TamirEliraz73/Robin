import com.core.base.group.BaseBodyPart;
import org.jetbrains.annotations.NotNull;

public enum RobinBodyParts implements BaseBodyPart {
    BODY, HAIR, HAT, LEGS, SHOES, ROBES, BELT, QUIVER;
    
    @Override
    public @NotNull String fileName() {
        return "openGameArt/wulax/walkcycle/" + switch (this) {
            case BODY -> "BODY_male";
            case SHOES -> "FEET_shoes_brown";
            case HAIR -> "HEAD_hair_blonde";
            case HAT -> "HEAD_leather_armor_hat";
            case QUIVER -> "BEHIND_quiver";
            case BELT -> "BELT_leather";
            case ROBES -> "TORSO_robe_shirt_brown";
            case LEGS -> "LEGS_robe_skirt";
        } + ".png";
    }
    
    @Override
    public boolean getDefaultVisibility() {
        return switch (this) {
            case QUIVER -> false;
            default -> true;
        };
    }
}