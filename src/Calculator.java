import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 02/08/13
 * Time: 10:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {

    public static final char MULTIPLY = '*';
    public static final char ADDITION = '+';
    private static int NOT_FOUND = -1;
    public int getNumber(String input,Integer startPosition){
        StringBuffer numberInString = new StringBuffer();
        int i;
        for(i=startPosition;i<input.length() && Character.isDigit(input.charAt(i));i++){
            numberInString.append(input.charAt(i));
        }
        startPosition = i;
        try {
            return Integer.parseInt(numberInString.toString());
        } catch(NumberFormatException e) {
            return NOT_FOUND;
        }
    }
    public int evaluate(String input){

        Integer result=0;
        int findPosition=0;
        char operation = getOperation(input);
        for(int i=0;i<input.length();i++)
        {
            Integer number = getNumber(input,findPosition);
            findPosition += getNextPosition(number);
            if(number==NOT_FOUND) {
                         break;
            }
            result = performOperation(result,number,operation);
        }
        return result;
    }

    private int getNextPosition(Integer number) {
        return String.valueOf(number).length()+1;
    }

    private char getOperation(String input) {
        return input.charAt(input.length()-1);
    }

    public int performOperation(Integer result, Integer number, char operation) {
        if(operation== ADDITION){
            result = result + number;
        }
        if(operation== MULTIPLY){
            result = result * number;
        }
        return result;
    }

}
