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
//
    Calculator calculator = new Calculator();


    @Test
    public void testgetNumberFortyFiveCommaGivesFortyFive() throws Exception {
        assertEquals(45,calculator.getNumber("45,",0));

    }

    @Test
      public void testgetNumberSixtyFiveCommaGivesSixtyFive() throws Exception {
        assertEquals(65,calculator.getNumber("65,",0));

    }
    @Test
    public void testgetNumberSixtyFiveDollarGivesSixtyFive() throws Exception {
        assertEquals(65,calculator.getNumber("65$,",0));

    }

    @Test
    public void testPerformOperationFiveSixPlusGivesEleven() throws Exception {
        assertEquals(11,calculator.performOperation(5,6,'+'));

    }

    @Test
    public void testPerformOperationTwoThreePlusGivesEleven() throws Exception {
        assertEquals(5,calculator.performOperation(2,3,'+'));

    }
    @Test
    public void testPerformOperationFiveSixMultiplyGivesEleven() throws Exception {
        assertEquals(30,calculator.performOperation(5,6,'*'));

    }

    @Test
    public void testPerformOperationTwoThreeMultiplyGivesEleven() throws Exception {
        assertEquals(6,calculator.performOperation(2,3,'*'));

    }
    @Test
    public void testEvaluationOfFortyFiveCommaPlusIsFortyFive(){
           assertEquals(45,calculator.evaluate("45,+"));
    }
    @Test
    public void testEvaluationOfSixtyFiveCommaPlusIsSixtyFive(){
        assertEquals(65,calculator.evaluate("65,+"));
    }
    @Test
    public void testEvaluationOfFiftySixtyCommaSixtyPlusIsHunderedAndTen(){
        assertEquals(110,calculator.evaluate("50,60,+"));
    }
    public void testEvaluationOfFortyFiveCommaEightyNineCommaOnePlusIsOneHunderedThirtyFive(){
        assertEquals(135,calculator.evaluate("45,89,1,+"));
    }
    public void testEvaluationOfThreeDashFourDashSixDashAsterixIsSeventyTwo(){
        assertEquals(72,calculator.evaluate("3-4-6-*"));
    }
    public void testEvaluationOfThreeCommaFourDashSixDashAsterixIsSeventyTwo(){
        assertEquals(72,calculator.evaluate("3,4-6-*"));
    }

}
