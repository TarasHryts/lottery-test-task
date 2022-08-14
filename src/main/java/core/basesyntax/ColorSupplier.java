package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index].getName();
    }
}
