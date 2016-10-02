package com.example.queenabergen.cuesays;

/**
 * Created by queenabergen on 9/30/16.
 */

public class GameLogic {
    public void comparison(){

        char colorArray[] = {'y','g','b','r'};
        for(int i=0;i< colorArray.length;i++){
            System.out.print(colorArray);
        }
        char userSelection[] = new char[0];
        int currentRound = 1;

        if (userSelection == colorArray){
            currentRound++;
        } else {
            //end game, offer the chance to restat
        }
    }
}
