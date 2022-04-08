package lesson14.annotation.main;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*@MyAnnotation*/
@Data
public class Cat {
    @MyAnnotation(priority = 1)
//    @Getter
//    @Setter
    public int age = 5;

    @MyAnnotation
    public Cat(/*@MyAnnotation*/ int age) {
        this.age = age;
    }

    public void doWork(String s) {
        System.out.println(s.toUpperCase());
    }
}
