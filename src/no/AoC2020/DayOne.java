package no.AoC2020;

import java.io.IOException;

public class DayOne {
    ReadFile RF = new ReadFile();
    int[] entries = new int[200];
    public DayOne() throws IOException {

    }

    public int TaskOne() throws IOException {
        RF.ReadList(entries);
        int retVal = 0;
        for(int i = 0; i<entries.length; i++){
            for(int j = 0; j<entries.length; j++){
                if(entries[i] + entries[j] == 2020){
                    retVal = entries[i] * entries[j];
                    break;
                }
            }
        }
        return retVal;
    }
    public int TaskTwo() throws IOException {
        RF.ReadList(entries);
        int retVal = 0;
        for(int i = 0; i<entries.length; i++){
            for(int j = 0; j<entries.length; j++){
                for(int k= 0; k< entries.length; k++)
                    if(entries[i] + entries[j] + entries[k] == 2020){
                        retVal = entries[i] * entries[j] * entries[k];
                        break;
                    }
            }
        }
        return retVal;
    }
}
