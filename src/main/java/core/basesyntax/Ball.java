package core.basesyntax;

public class Ball {
    private String ballColor;
    private int ballNumber;

    void setBallColor(String ballColor) {
        this.ballColor = ballColor;
    }

    void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public String toString() {
        return "Ball with number: " + ballNumber + " and color: " + ballColor;
    }
}
