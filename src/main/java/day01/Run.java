package day01;

import java.time.LocalDate;

public class Run {

    private double km;
    private LocalDate startTime;

    public Run(double km, LocalDate startTime) {
        this.km = km;
        this.startTime = startTime;
    }

    public double getKm() {
        return km;
    }

    public LocalDate getStartTime() {
        return startTime;
    }
}
