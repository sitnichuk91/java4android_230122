package lesson11HW;public class TestPhoneBook {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Jack", "01");
        myPhoneBook.add("Bill", "02");
        myPhoneBook.add("Lucy", "03");
        myPhoneBook.add("Jill", "04");
        myPhoneBook.add("Jack", "05");
        myPhoneBook.add("Jack", "06");
        myPhoneBook.add("Lucy", "07");
        myPhoneBook.add("Jill", "08");
        myPhoneBook.add("Jill", "09");

        System.out.println(myPhoneBook.get("Jack"));
        System.out.println(myPhoneBook.get("Jill"));
        System.out.println(myPhoneBook.get("Bill"));
    }
}
