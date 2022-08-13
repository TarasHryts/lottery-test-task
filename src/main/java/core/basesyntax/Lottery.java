package core.basesyntax;

import java.util.Random;

class Lottery extends ColorSupplier {
    Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setBallColor(getRandomColor());
        ball.setBallNumber(new Random().nextInt(100));
        return ball;
    }
}
