import util.StringConstants;

public class brackets2 {
    public static void generateBrackets(int numberOfBrackets) {
        if (numberOfBrackets % 2 != 0) {
            System.out.println(StringConstants.NOT_VALID);
        } 
        else {
            String bracket = "{}".repeat(numberOfBrackets / 2);
            char[] brackets1 = bracket.toCharArray();
            String[] noOfBrackets = heap.GenerateCombinations(brackets1, brackets1.length);
            for (String s : noOfBrackets) {
                if(brackets.checkBrackets(s)==true){
                    System.out.println(s);
                }
            }
        }
    }

    public static void main(String[] args) {
        int numberOfBrackets = 6;
        generateBrackets(numberOfBrackets);
    }
}
