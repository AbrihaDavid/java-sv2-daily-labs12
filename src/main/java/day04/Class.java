package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Class {


    public List<String> readFile(){

        try {
            return Files.readAllLines(Paths.get("src/main/resources/beosztas.txt"));
        }
        catch (IOException ioe){
            throw new IllegalArgumentException("No such file");
        }
    }

    public int hoursPerWeek(String name){
        List<String> lines = readFile();
        int sum = 0;
        List<String> teacherWithHour = new ArrayList<>();

        for (int i = 0; i < lines.size(); i = i+4){
            teacherWithHour.add(lines.get(i).concat(",").concat(lines.get(i+3)));
        }

        for (String s: teacherWithHour){
            String[] temp = s.split(",");
            if (temp[0].equals(name)){
                sum = sum + Integer.parseInt(temp[1]);
            }
        }
        return sum;
    }
}
