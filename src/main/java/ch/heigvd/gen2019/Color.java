package ch.heigvd.gen2019;

public enum Color {
    BLUE("blue"),
    RED("red"),
    YELLOW("yellow"),
    NO_COLOR("no color");

    private final String name;

    Color(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
