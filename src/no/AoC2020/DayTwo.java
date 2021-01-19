package no.AoC2020;

import java.io.IOException;

public class DayTwo {

    ReadFile RF = new ReadFile();
    String[] entries = new String[1000];

    public DayTwo() throws IOException {

    }

    public int TaskOne() {
        RF.ReadList(entries);

        int countValid = 0;

        for (String entry : entries) {
            String[] split = entry.split(" ");
            String[] splitNum = split[0].split("-");
            int low = Integer.parseInt(splitNum[0]);
            int high = Integer.parseInt(splitNum[1]);
            int count = 0;

            for (int j = 0; j < split[2].length(); j++) {
              if(split[2].charAt(j)==(split[1].charAt(0))){
                  count++;
              }
            }
            if(low<=count && count<=high){
                countValid++;
            }
        }

        return countValid;
    }

    public int TaskTwo(){
        RF.ReadList(entries);

        int countValid = 0;

        for (String entry : entries) {
            String[] split = entry.split(" ");
            String[] splitNum = split[0].split("-");
            int firstPlace = Integer.parseInt(splitNum[0])-1;
            int secondPlace = Integer.parseInt(splitNum[1])-1;



                if(!(split[2].charAt(firstPlace)==split[2].charAt(secondPlace)) ){
                    if(split[2].charAt(firstPlace)==split[1].charAt(0) || split[2].charAt(secondPlace)==split[1].charAt(0)){
                        countValid++;
                    }
                }



        }

        return countValid;
    }
}
