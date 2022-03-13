package lesson8.part2;

public class Cat {
    private Color color;
    private final CatAttributes catAttributes;

    public enum Color2 {
        BLACK, GREY, RED
    }

    public Cat() {
      this(null, 0, 0, Color.BLACK );
    }

    public Cat(String name, int age, int weight, Color color) {
        this.color = color;
        catAttributes = new CatAttributes(name, age, weight);
    }

    private class CatAttributes {
        private String name;
        private int age;
        private int weight;

        public CatAttributes(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "CatAttributes{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color=" + color.getRussianColor() + " " + catAttributes + '}';
    }

    /*static class test {

    }*/
}
