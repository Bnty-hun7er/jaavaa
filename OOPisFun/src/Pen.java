public class Pen {

    String type = "Clickable";
    String color = "blue";
    double diameter = 0.1;
    int inkLevel = 2;

    boolean isClicked = false;
    boolean isFinished = false;

    public void click() {
        isClicked = true;
    }

    public void unclick() {
        isClicked = false;
    }

    public void checkFinished() {
        if (inkLevel == 0) {
            isFinished = true;
            System.out.println("Pen is finished");
        } else {
            isFinished = false;
            System.out.println("Pen can write more");
        }
    }
}
