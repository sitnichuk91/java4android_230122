package lesson8.part2;

public class Cat {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color=" + color.getRussianColor() +
                '}';
    }

    /*static class test {

    }*/
}
