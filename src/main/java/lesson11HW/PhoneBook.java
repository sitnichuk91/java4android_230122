package lesson11HW;

import java.util.*;
import java.util.function.BiConsumer;

public class PhoneBook {
    Map<String, List<String>> phoneNumbers;

    public PhoneBook() {
        this.phoneNumbers = new HashMap<>();
    }

    public void add(String name, String number) {
        if (this.phoneNumbers.containsKey(name)){
            List<String> tempList = new ArrayList<>();
            Collections.addAll(tempList, phoneNumbers.get(name).toArray(new String[phoneNumbers.get(name).size()]));
            tempList.add(number);
            phoneNumbers.put(name, tempList);
        } else {
            /*List<String> tempList = new ArrayList<>();
            tempList.add(number);*/
            this.phoneNumbers.put(name, Arrays.asList(number));
        }


    }

   /* private boolean checkName(String name) {
        for (Map.Entry<String, List<String>> entry : phoneNumbers.entrySet()) {
            if (entry.getKey().equals(name)){
                return true;
            }
        }
        return false;
    }*/

    public String get(String name) {
        return String.format("%s -> %s", name, this.phoneNumbers.get(name));
    }
}
