package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void testGreatestCommonDivisor(){
        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        assertEquals(6,mathAlgorithms.greatestCommonDivisor(12,18));
    }

}