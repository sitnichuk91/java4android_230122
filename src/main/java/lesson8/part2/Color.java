package lesson8.part2;

public enum Color {
    BLACK("Черный"),
    WHITE("Беляш"),
    RED("Рыжий"),
    GREY("Серый");

    private String russianColor;

    Color(String russianColor) {
        this.russianColor = russianColor;
    }

    public String getRussianColor() {
        return russianColor;
    }
}
