package lesson7;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StringFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\main\\resources\\text1111.txt"); //в конструкторе указываем относительный(если файл в проекте, от корня проекта), либо абсолютный путь(от начала, жесткого диска)
        if (file.exists()){
            file.delete();
        } else {
            file.createNewFile();
        }

        BufferedInputStream is = new BufferedInputStream(new FileInputStream(file));
        System.out.println(new String(is.readAllBytes()));
    }


}
