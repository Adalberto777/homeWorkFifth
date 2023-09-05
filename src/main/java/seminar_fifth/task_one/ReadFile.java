package seminar_fifth.task_one;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    public static String readFile (String path) throws IOException {
        try (BufferedInputStream stream = new BufferedInputStream(new FileInputStream(path))) {
        return new String(stream.readAllBytes());
        }
    }
}
