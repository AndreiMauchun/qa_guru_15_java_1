package guru.qa;

public class HelloWorld {

    public static void main(String[] args) {

        // Arithmetic operators

        int aFirstValue = 100;
        int bSecondValue = 50;

        double cThirdValue = 1.5;
        double dFourthValue = 2.5;

        System.out.println(aFirstValue + bSecondValue);
        System.out.println(aFirstValue - bSecondValue);
        System.out.println(aFirstValue * bSecondValue);
        System.out.println(aFirstValue / bSecondValue);
        System.out.println(aFirstValue % bSecondValue);

        System.out.println(bSecondValue + dFourthValue);
        System.out.println(aFirstValue + cThirdValue);

        //Comparison operators

        int value1 = 1;
        int value2 = 2;

            System.out.println("value1 == value2 = " + (value1 == value2));
            System.out.println("value1 != value2 = " + (value1 != value2));
            System.out.println("value1 > value2 = " + (value1 > value2));
            System.out.println("value1 < value2 = " + (value1 < value2));
            System.out.println("value1 >= value2 = " + (value1 >= value2));
            System.out.println("value1 <= value2 = " + (value1 <= value2));

            // The if/else construct

        int number1 = 5;
        int number2 = 10;
        if (number2 > number1) {
            System.out.println("second number over first");
        }

        int num1 = 1;
        int num2 = 2;
        if (number1 > number2) {
            System.out.println("first number over second");
        }
        else {
            System.out.println("the first number is less than the second");
        }

        //The Conditional Operators

        int valueA = 2;
        int valueB = 3;
        if (valueA < valueB && valueA >= 2 ) {
            System.out.println("valueA < valueB and valueA = 2");
        }

        //overflow
        int numberM = Integer.MAX_VALUE+1;
        System.out.println(numberM);

        int numberB =Integer.MIN_VALUE-1;
        System.out.println(numberB);

    }
}
