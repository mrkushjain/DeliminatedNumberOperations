import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 02/08/13
 * Time: 10:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorTests {

    Calculator calculator = new Calculator();
    @Test
    public void testEvaluationOfFortyFiveCommaPlusIsFortyFive(){
           assertEquals(45,calculator.evaluate("45,+"));
    }
    @Test
    public void testEvaluationOfSixtyFiveCommaPlusIsSixtyFive(){
        assertEquals(65,calculator.evaluate("65,+"));
    }
}
