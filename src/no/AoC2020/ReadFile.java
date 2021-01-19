package no.AoC2020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    //static String filePath = "//Users//bendikbreidablikk//IdeaProjects//AdventOfCode2020//Assets//DayTwoInput.txt";
    static String filePath = "C:\\Users\\benbre\\IdeaProjects\\AdventOfCode2020\\Assets\\DayTwoInput.txt";
    Scanner in = new Scanner(new File(filePath));

    public ReadFile() throws FileNotFoundException {
    }

    public String[] ReadList(String entries[]){
        int i = 0;
        while(in.hasNext()){
            //System.out.println(in.nextLine());
            entries[i] = in.nextLine();
            i++;
        }
        return entries;
    }
    public int[] ReadList(int entries[]){
        int i = 0;
        while(in.hasNext()){
            //System.out.println(in.nextLine());
            entries[i] = in.nextInt();
            i++;
        }
        return entries;
    }
}
