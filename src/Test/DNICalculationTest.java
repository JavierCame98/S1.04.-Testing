package Test;

import S0412.DNICalculation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class DNICalculationTest {

    private static Stream<Arguments> DNIProvider(){
        return Stream.of(
                Arguments.of(10000000, 'X'),
                Arguments.of(20000000, 'S'),
                Arguments.of(30000000, 'B'),
                Arguments.of(40000000, 'J'),
                Arguments.of(50000000, 'P'),
                Arguments.of(12345678, 'E'),
                Arguments.of(87654321, 'R'),
                Arguments.of(70000000, 'J'),
                Arguments.of(0, 'T'),
                Arguments.of(99999999, 'R')
        );
    }

    @Test


}
