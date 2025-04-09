package JavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class javaIO1 {
    public static void main(String[] args) {
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("Kodari Gang.srt"));
            writer.write("0.10 - 0.20\n");
            writer.write("Enga anna thongitu irukaru\n");
            writer.write("0.20 - 0.30\n");
            writer.write("elutha neenga closeu\n");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try{
            BufferedReader reader=new BufferedReader(new FileReader("Kodari Gang.srt"));
            System.out.println(reader.readLine());

            String contents;
            while((contents=reader.readLine())!=null){
                System.out.println(contents);
            }
            reader.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
