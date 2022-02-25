package lesson7;

public class StringConcat {

    public static void main(String[] args) {
        String a1 = "Hello my ";
        String a2 = "Dear world";
        String a3 = a1 + a2;
//        a3 = a1.concat(a2);

        String b1 = "Number";
        int b2 = 10;
        String b3 = b1 + b2;
//        b3 = b1.concat(String.valueOf(b2));

        String c = "(" + 2 + 3 + ")" + b3 + "!";

        System.out.println(a1.equalsIgnoreCase(a2));
        System.out.println(a1.compareTo(a2));

        String spaces = "    \n\t    ";
        System.out.println(spaces.trim()); // delete odd spaces in String
        System.out.println(spaces == null); // "" - false
        System.out.println(spaces.isEmpty());// "" - true, " " - false
        System.out.println(spaces.isBlank());// " " - true
        System.out.println(spaces.trim().isEmpty());// the same as isBlank

        System.out.println(a3.substring(10)); // обрезаем строку. Выводим от 10го до конца
        System.out.println(a3.substring(10, 15)); // обрезаем строку. Выводим от 10го до 15го

//        for (char c1 : a3.toCharArray()) переводим строку в массив символов
        for (String s : a3.split("\s+", 3)) {
            System.out.println("Word: " + s);
        }
        System.out.println(a3.charAt(10));
        System.out.println(a3.indexOf("e", 2));
        System.out.println(a3.replaceAll("my", "Our"));
        System.out.println(a3.repeat(2));
        String str = "/msg name text of the message";
        System.out.println(a3.startsWith("/msg"));
        if (str.startsWith("/msg")){
            String[] strArray = str.split("\s+", 3);
            System.out.println("User: " + strArray[1]);
            System.out.println("Message: " + strArray[2]);
        }
    }

    private static String message(boolean b) {
        return "Your char had".concat(b ? " " : "n't ").concat("been found!");
    }
}
