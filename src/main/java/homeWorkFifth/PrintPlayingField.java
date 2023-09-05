package homeWorkFifth;

import java.util.ArrayList;

public class PrintPlayingField {
    public static void printPlayingField(int[] playingField){

        int count = 0;
        for (int i = 0; i < playingField.length; i++) {
            if (playingField[i] == 0)  {
                System.out.print("|     ");
            } else if (playingField[i] == 1) {
                System.out.print("|  X  ");
            } else if (playingField[i] == 2) {
                System.out.print("|  O  ");
            }else{
                System.out.print("|  ?  ");
            };
            count++;
            if (count == 3){
                System.out.println("|");
                System.out.println("___________________");
                count = 0;
            }
        }
    }

}

