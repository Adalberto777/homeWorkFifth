package homeWorkFifth;

import java.io.IOException;
import java.util.Arrays;

import static homeWorkFifth.CreateBackup.createBackup;
import static homeWorkFifth.LoadGame.loadGame;
import static homeWorkFifth.PrintPlayingField.printPlayingField;
import static homeWorkFifth.SaveGame.saveGame;

public class Main {
    public static void main(String[] args) throws IOException {
        // createBackup("./src/main/java/homeWorkFifth/backup", ".");

        int[] playingField = {3, 2, 1, 1, 1, 2, 2, 1, 0};


        saveGame(playingField, "save1.out");
        //System.out.println(Arrays.toString(loadGame(playingField, "save1.out")));
        printPlayingField(loadGame(playingField, "save1.out"));



    }
}
