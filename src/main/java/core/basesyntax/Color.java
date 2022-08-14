package core.basesyntax;

public enum Color {
    BLACK("black"), WHITE("white"), RED("red"), BLUE("blue");
    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
