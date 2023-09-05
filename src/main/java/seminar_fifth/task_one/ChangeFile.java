package seminar_fifth.task_one;

import java.io.FileWriter;
import java.io.IOException;

public class ChangeFile {
    public static void changeFile (String sours, char changeChar, String path) throws IOException {
        String string = sours.replaceAll(String.valueOf(changeChar), " ");
        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write(string);
        }
    }

}
