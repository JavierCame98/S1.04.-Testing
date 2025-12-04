package Test;

import S0412.DNICalculation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DNICalculationTest {

    private static Stream<Arguments> DNIProvider(){
        return Stream.of(
                Arguments.of(10000000, 'Z'),
                Arguments.of(21786008, 'V'),
                Arguments.of(30000000, 'L'),
                Arguments.of(40000000, 'X'),
                Arguments.of(50000000, 'R'),
                Arguments.of(12345678, 'Z'),
                Arguments.of(87654321, 'X'),
                Arguments.of(70000000, 'Y'),
                Arguments.of(0, 'T'),
                Arguments.of(99999999, 'R')
        );
    }

    @ParameterizedTest
    @MethodSource("DNIProvider")
    void testCalculationExpectedLetter (int DNINumber, char expectedLetter){
        char DNILetter = DNICalculation.letterCalculation(DNINumber);
        assertEquals(expectedLetter,DNILetter);
    }



}
