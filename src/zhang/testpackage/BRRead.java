package zhang.testpackage;

import java.io.*;

public class BRRead {
    public static void main(String[] args){
        char c=' ';
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input any thing, while 'q' exit.");
        do{
            try {
                c=(char) br.read();
                System.out.print(c);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.print("exception happened");
            }

        }while(c!='q');

    }
}
