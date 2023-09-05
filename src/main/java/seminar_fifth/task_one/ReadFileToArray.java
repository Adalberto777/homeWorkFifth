package seminar_fifth.task_one;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReadFileToArray {
    public static int[] readFileToArray (String path) throws IOException {
        ArrayList<Integer> arr = new ArrayList<>();
        try (FileReader fileReader = new FileReader(path)) {
            int n;
            boolean flag = true;
            while ((n = fileReader.read()) != -1){
                char temp = (char) n;
                if(temp == '0' && flag)
                    flag = false;
                else if (temp != '0' || (temp == '0' && !flag)){
                    flag = true;
                    try {
                        arr.add(Integer.parseInt(String.valueOf(temp)));
                    } catch (NumberFormatException e){
                        e.printStackTrace();
                    }
                }

            }
        }
        int index = 0;
        int result[] = new int[arr.size()];
        for (Integer integer: arr) {
            result[index++] = integer.intValue();
        }

        return result;
    }
}
