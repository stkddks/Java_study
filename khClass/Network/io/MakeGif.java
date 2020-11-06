package io;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MakeGif {
    public static void main(String[] args) {

        try {
            StringTokenizer st = null;
            File file = new File("C:\\dev\\quiz.txt");
            FileReader read = new FileReader(file);
            BufferedReader bReader = new BufferedReader(read);
            ArrayList<Byte> list = new ArrayList<>();
            FileOutputStream fOutputStream = new FileOutputStream("C:\\dev\\quiz.gif");
            try {
                st = new StringTokenizer(bReader.readLine());
            } catch (IOException e) {                
                e.printStackTrace();
            }
            while(st.hasMoreTokens()){
                list.add((byte)(Integer.parseInt(st.nextToken(), 16)));
            }
            for(byte b : list){
                try {
                    fOutputStream.write(b);
                } catch (IOException e) {                    
                    e.printStackTrace();
                }
            }
            try {
                bReader.close();
            } catch (IOException e) {                
                e.printStackTrace();
            }
            try {
                fOutputStream.close();
            } catch (IOException e) {                
                e.printStackTrace();
            }           

        } catch (FileNotFoundException e) {
                
            e.printStackTrace();
            }
    }     
}