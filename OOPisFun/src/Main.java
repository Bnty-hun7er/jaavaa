import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();

        System.out.println(pen.type);
        System.out.println(pen.color);
        System.out.println(pen.inkLevel);
        System.out.println(pen.isClicked);

        pen.click();
        System.out.println(pen.isClicked);

        pen.unclick();
        System.out.println(pen.isClicked);

        System.out.println(pen.isFinished);

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the ink level in integer: ");
        int newLevel = scan.nextInt();
        pen.inkLevel = newLevel;

        pen.checkFinished();
        System.out.println(pen.isFinished);
        System.out.println(pen.inkLevel);
    }
}
