package excercises;

public class SubClass extends SuperClass implements SampleInterface {

    int randomIntFromSubClass;

    public SubClass(int randomInt, int randomIntFromSubClass) {
        super(randomInt);
        this.randomIntFromSubClass = randomIntFromSubClass;
    }

    @Override
    public int giveNumberFromInterface() {
        return randomIntFromSubClass + super.getRandomInt() + alwaysGive10FromInterface();
    }
}
