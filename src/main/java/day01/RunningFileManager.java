package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class RunningFileManager {

    private List<Run> running = new ArrayList<>();

    public void readAllLines(String fileName){

        try(BufferedReader br = Files.newBufferedReader(Path.of(fileName))){

            String line;
            br.readLine();
            while ((line = br.readLine())!=null){
                Run run = createRunObjectFromLine(line);
                running.add(run);

            }

        } catch (IOException ioe){
            throw new IllegalStateException("Can not read file",ioe);
        }
    }

    public double sumOfMonthAndYear(int year, Month month){
        double sum = 0;
        for (Run r: running){
            if(r.getStartTime().getYear() == year && r.getStartTime().getMonth() == month){
                sum+= r.getKm();
            }
        }
        return sum;
    }

    private Run createRunObjectFromLine(String line) {
        String[] temp = line.split(";");
        return new Run(Double.parseDouble(temp[0].split(" ")[0]), LocalDate.parse(temp[1]));
    }
}
