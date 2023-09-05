package seminar_fifth.task_one;

import java.io.IOException;
import java.util.Arrays;

import static seminar_fifth.task_one.ChangeFile.changeFile;
import static seminar_fifth.task_one.ReadFile.readFile;
import static seminar_fifth.task_one.ReadFileToArray.readFileToArray;
import static seminar_fifth.task_one.WriterToFile.writerToFile;
import static seminar_fifth.task_one.WriterToFile.writeZero;

public class Main {
    public static void main(String[] args) throws IOException {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //writerToFile(arr);

        //writerToFile(writeZero(arr));

        //System.out.println(Arrays.toString(readFileToArray("src/main/java/seminar_fifth/task_one/ArrFile.txt")));

        System.out.println(readFile("src/main/java/seminar_fifth/task_one/Test.txt"));
        changeFile(readFile("src/main/java/seminar_fifth/task_one/Test.txt"), 'o', "src/main/java/seminar_fifth/task_one/Test0.txt");
    }

}
