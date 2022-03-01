package lesson8.part2;

public class Main {
    public static void main(String[] args) {
        testEnum();
        testAnonClass();
    }



    private static void testEnum() {
        Cat cat = new Cat();
        /*cat.setColor(ColorOld.GREY);
        cat.setColor("ColorOld.GREY");*/
        cat.setColor(Color.WHITE);

        System.out.println("The color of the cat is " + cat.getColor());
        System.out.println();
        System.out.println(cat);

        /*switch (cat.getColor()){
            case WHITE ->
        }*/


    }

    private static void testAnonClass() {
        /*MainClass one = new OneTest();
        MainClass two = new TwoClass();*/

        /*MainClass one = new MainClass(){
            @Override
            public void action() {
                System.out.println("Action motherfucker!");
            }
        };
        MainClass two = new MainClass(){
            @Override
            public void action() {
                System.out.println("KJFNVSFMN");
            }
        };


        one.action();
        two.action();*/

        TestInterface foo = new TestInterface() {
            @Override
            public void action(int a, int b) {
                System.out.println("a + b = " + (a + b));
            }
        };
        // тоже самое можно записать в виде лямбда выражение ниже
        TestInterface bar = (a, b) -> System.out.println(a + " + " + b + " = " + (a + b));

        TwoTestInterface baz = System.out::println;


        foo.action(2,3);
        bar.action(5, 7);
    }
}
