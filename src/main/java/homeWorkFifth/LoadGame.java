package homeWorkFifth;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoadGame {
    public static int[] loadGame(int[] playingField, String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        int b;
        int i = 0;
        while ((b = fis.read()) != -1) {
            for (int v = 0; v < 3; ++v) {
                playingField[i++] = b >> (v * 2) & 0x3;
            }
        }
        fis.close();
        return playingField;
    }


}
