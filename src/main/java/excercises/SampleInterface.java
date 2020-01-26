package excercises;

public interface SampleInterface {
    default int alwaysGive10FromInterface() {
        return 10;
    }

    int giveNumberFromInterface();
}
