package excercises;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SuperClass extends AbstractClass {

    private int randomInt;

    public int giveMeSomeNumber() {
        return randomInt;
    }
}
