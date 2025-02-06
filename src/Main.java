//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int intOperandA = 1;
        int intOperandB = 5;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        double doubleOperandA = 3.50;
        double doubleOperandB = 7.25;
        double doubleSum = 0.0;
        double doubleProduct = 0.0;
        double doubleDifference = 0.0;
        double doubleQuotient = 0.0;


        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);




    }
}