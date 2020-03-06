import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testJunitFunction() {

        //arrange
        //act
        int excepted = 3;
        int actual = calc.add(1, 2);
        //assert
        assertEquals(excepted, actual);

    }

    @Test
    public void wrongInput() {
        int expected = 7;
        int actual = calc.add(1, 6);
        assertEquals(expected, actual);
    }

    @Test
    public void mismatchexceptionthrow()

    {
        assertThrows(InputMismatchException.class,()->{
            calc.add(1001, 2);
        });

    }

    @Test
    public void evenFunctionArgumentExceptionFail(){
        assertThrows(IllegalArgumentException.class,()->{
           calc.isEven(1001);
        });
    }
    @Test
    public void isEventestEvenNumberTrue(){
        boolean boolexpected = true;
        boolean boolActual = calc.isEven(20);

        assertEquals(boolexpected,boolActual);
    }
    @Test
    public void isEventestEvenNumberFalse(){
        boolean boolexpected = false;
        boolean boolActual = calc.isEven(19);

        assertEquals(boolexpected,boolActual);
    }
}


