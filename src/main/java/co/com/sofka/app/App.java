package co.com.sofka.app;

import co.com.sofka.app.calculator.BasicCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) throws IOException {
        //System.out.println( "Hello World!" );
        BufferedReader bufferedReader= new BufferedReader( new InputStreamReader( System.in ));
        System.out.printf("Enter number 1: ");
        String textNumber1 = bufferedReader.readLine();

        System.out.printf("Enter number 2: ");
        String textNumber2 = bufferedReader.readLine();

        Long number1 = Long.valueOf(textNumber1);
        Long number2 = Long.valueOf(textNumber2);

        BasicCalculator calculator = new BasicCalculator();
        Long resultSum = calculator.sum(number1, number2);
        Long resultSub = calculator.subtract(number1, number2);
        Long resultMul = calculator.multiply(number1, number2);
        Float resultDiv = calculator.divide(number1, number2);

        System.out.printf(number1 + " + " + number2 + " = " + resultSum);
        System.out.printf(number1 + " - " + number2 + " = " + resultSub);
        System.out.printf(number1 + " * " + number2 + " = " + resultMul);
        System.out.printf(number1 + " / " + number2 + " = " + resultDiv);
    }
}
