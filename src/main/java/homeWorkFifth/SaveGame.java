package homeWorkFifth;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveGame {
    public static void saveGame(int[] playingField, String path) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        for (int b = 0; b < 3; b++) {
            byte wr = 0;
            for (int v = 0; v < 3; v++) {
                wr += (byte) (playingField[3 * b + v] << (v * 2));
            }
            fos.write(wr);
        }
        fos.flush();
        fos.close();
    }
}
