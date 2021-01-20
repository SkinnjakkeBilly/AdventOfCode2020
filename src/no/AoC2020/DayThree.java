package no.AoC2020;

import java.io.IOException;

public class DayThree {
    ReadFile RF = new ReadFile();
    String[] entries = new String[323];

    public DayThree() throws IOException {

    }

    public int TaskOne(){
        RF.ReadList(entries);
        int count = 0;
        int index = 0;

        for(int i = 0; i<entries.length; i++){
            if(i!=0 && entries[i]!=null){
                entries[i] = entries[i].repeat(i);
            }
            if(entries[i].charAt(index)=='#'){
                count++;
            }

            index+=3;
        }
        return count;
    }
    public int TaskTwo(){
        RF.ReadList(entries);
        int count = 0;
        int index = 0;

        for(int i = 0; i<entries.length; i++){
            if(i!=0 && entries[i]!=null){
                entries[i] = entries[i].repeat(i);
            }
            if(entries[i].charAt(index)=='#'){
                count++;
            }

            index+=3;
        }
        return count;
    }
}
