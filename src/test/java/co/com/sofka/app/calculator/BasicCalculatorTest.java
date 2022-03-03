package co.com.sofka.app.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum(){

        //Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        //Act
        Long result = basicCalculator.sum(number1, number2);

        //Assert
        Assertions.assertEquals(expectedValue, result);

    }

    
    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSum(Long first, Long second, Long expectedResult){
        Assertions.assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first.toString() + " + " + second.toString() + " should equal " + expectedResult.toString());
    }


    @DisplayName("Testing several substracts")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1,   -1",
            "2,    1,   1",
            "1000,  1, 999",
            "1,  100, -99"
    })
    public void severalSubtracts(Long first, Long second, Long expectedResult){
        Assertions.assertEquals(expectedResult, basicCalculator.subtract(first, second),
                () -> first.toString() + " - " + second.toString() + " should equal " + expectedResult.toString());
    }


    @DisplayName("Testing several multiplications")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,    1,   0",
            "1,    2,   2",
            "9,  5, 45",
            "1,  100, 100"
    })
    public void severalMultiplications(Long first, Long second, Long expectedResult){
        Assertions.assertEquals(expectedResult, basicCalculator.multiply(first, second),
                () -> first.toString() + " * " + second.toString() + " should equal " + expectedResult.toString());
    }

    @DisplayName("Testing several divisions")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "0,    1,   0",
            "1,    2,   0.5",
            "18,  2,   9",
            "1,  100, 0.01"
    })
    public void severalDivisions(Long first, Long second, Float expectedResult){
        Assertions.assertEquals(expectedResult, basicCalculator.divide(first, second),
                () -> first.toString() + " / " + second.toString() + " should equal " + expectedResult.toString());
    }

}
