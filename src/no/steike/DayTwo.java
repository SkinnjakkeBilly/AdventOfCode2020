package no.steike;

import java.io.IOException;

public class DayTwo {

    ReadFile RF = new ReadFile();
    String[] entries = new String[1000];

    public DayTwo() throws IOException {

    }
/* TODO:
- splitt på mellomrom, kanskje?
- les antall bokstaver som matcher bokstaven som skal sjekkes
- sammenlign og sjekk om den er mindre enn og større enn område definert
*/
    public int TaskTwo() {
        RF.ReadList(entries);
        int retVal = 0;

        for(int i = 0; i<entries.length; i++){
            String[] split = entries[i].split(" ");
            for(int j = 0; j<split.length; j++){

            }
        }

        return retVal;
    }
}
