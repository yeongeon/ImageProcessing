package common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class CommonImage {

    public void load(String path){
        try {
            BufferedReader in = new BufferedReader(new FileReader(path));
            String s;

            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(StringBuilder sb, String target){

    }

    public String getResource(String path){
        return null;
    }
}
