package seminar_fifth.task_one;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WriterToFile {
    public static void writerToFile (int[] arr) throws IOException {
        try (FileWriter fileWriter = new FileWriter("src/main/java/seminar_fifth/task_one/ArrFile.txt")) {
            fileWriter.write(Arrays.toString(arr));
        }
    }

    public static String writeZero(int[] arr) throws IOException {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]).append("0");
        }


        return sb.toString();
    }

    public static void writerToFile (String arr) throws IOException {
        try (FileWriter fileWriter = new FileWriter("src/main/java/seminar_fifth/task_one/ArrFile.txt")) {
            fileWriter.write(arr);
        }
    }

}
