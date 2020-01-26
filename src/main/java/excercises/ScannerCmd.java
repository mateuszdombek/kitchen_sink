package excercises;

public class ScannerCmd {
    boolean isContinue = true;
    java.util.Scanner input = new java.util.Scanner(System.in);

    public void typeAsYouWantUntilEndSentence() {
        System.out.println("Hello");
        while (isContinue) {
            String next = input.next();
            System.out.println("You typed: " + next);
            if (next.equals("end")) {
                System.out.println("It means goodbye...");
                isContinue = false;
            }
        }
    }
}
