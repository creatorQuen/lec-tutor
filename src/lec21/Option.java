package lec21;

public class Option {
    private final String description;
    private final boolean isChosen;

    public Option(String description, boolean isChosen) {
        this.description = description;
        this.isChosen = isChosen;
    }

    // bad example
    public void setChosen(boolean chosen) {
        boolean isChosen = chosen;
    }

    public Option(Option old, boolean isChosen) {
        this.description = old.description;
        this.isChosen = isChosen;
    }
}
