/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 02/08/13
 * Time: 10:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {


    public int evaluate(String input) {

        String [] terms = input.split(",");
        return Integer.parseInt(terms[0]);
    }
}
