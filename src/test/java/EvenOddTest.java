import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenOddTest {
    @ParameterizedTest
    @CsvSource({"1,Not Weird", "6,Weird"})
    void evenOdd(String input, String expected) {
    //    EvenOdd tmp = EvenOdd.evenOdd(input);
//        assertEquals(expected, tmp.);
    }
}