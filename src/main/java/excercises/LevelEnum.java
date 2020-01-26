package excercises;

import lombok.Getter;

@Getter
public enum LevelEnum {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private final int level;

    LevelEnum(int level) {
        this.level = level;
    }
}
