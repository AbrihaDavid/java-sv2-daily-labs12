package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassTest {

    @Test
    void hoursPerWeek() {

        Class c = new Class();

        assertEquals(25,c.hoursPerWeek("Bagoly Barbara"));
        assertEquals(24,c.hoursPerWeek("Albatrosz Aladin"));
    }
}