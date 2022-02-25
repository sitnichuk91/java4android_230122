package lesson7;

public class StringCreateExample {
    public static void main(String[] args) {
        String s1 = "Java";
        String s7 = null;
        String s2  = new String("Java");

        String s3 = new String(new char[] {'A', 'B', 'C'});
        String s4 = new String(s1);
        String s8 = new String(String.valueOf(s7)); // преобразует к сроке даже null

        String s5 = new String(new byte[] {65, 66, 67});
        String s6 = """
                Java 1
                Java 2
                Java 3 \
                Again Java 3
                """;

        System.out.printf(" s1 = %s%n s2 = %s%n s3 = %s%n s4 = %s%n s5 = %s%n s6 = %s%n s8 = %s", s1, s2, s3, s4, s5, s6, s8);
    }
}
