package com.company;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args){
        Pattern pattern = Pattern.compile("(\\d*)", Pattern.DOTALL);
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String s = null;
            while ((s = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(s);
                writer.write(matcher.replaceAll("") + "\n");
            }
        }
        catch(IOException exception){
            System.out.println("Error");
        }
    }
}