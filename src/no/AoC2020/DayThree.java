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
    public long TaskTwo(){
        RF.ReadList(entries);
        int count=0, count2=0, count3=0, count4=0, count5 = 0;
        int index =0, index2=0, index3=0, index4=0, index5 = 0;
        int[][] trajectories = {{1, 1}, {3, 1}, {5, 1}, {7, 1}, {1, 2} };

        for(int i = 0; i<entries.length; i++){
            if(i!=0 && entries[i]!=null){
                entries[i] = entries[i].repeat(i);
            }
            if(entries[i].charAt(index)=='#' ){
                count++;
            }
            if(entries[i].charAt(index2)=='#'){
                count2++;
            }
            if(entries[i].charAt(index3)=='#'){
                count3++;
            }
            if(entries[i].charAt(index4)=='#'){
                count4++;
            }
            if(entries[i].charAt(index5)=='#' && i%2==0){
                count5++;
            }
            index+=trajectories[0][0];
            index2+=trajectories[1][0];
            index3+=trajectories[2][0];
            index4+=trajectories[3][0];
            if(i%2==0){
                index5+=trajectories[4][0];
            }

        }
        System.out.println("Count 1: "+ count);
        System.out.println("Count 2: "+ count2);
        System.out.println("Count 3: "+ count3);
        System.out.println("Count 4: "+ count4);
        System.out.println("Count 5: "+ count5);

        return (long) count *count2*count3*count4*count5;

    }
}
