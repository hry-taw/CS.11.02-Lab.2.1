/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: why is this here isn't this a lab
Haoran Yin I Guess
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int add2 = add(3, 8);
        System.out.println(add2);
        
        int add4 = add(3, 8, 4, 9);
        System.out.println(add4);

        String theOneAndOnlyMorningGreeting = morningGreeting("Toby Fox");
        System.out.println(theOneAndOnlyMorningGreeting);

        String theOneAndOnlyAfternoonGreeting = afternoonGreeting("Mac Miller");
        System.out.println(theOneAndOnlyAfternoonGreeting);

        String tripleThing = triple("oohbaby");
        System.out.println(tripleThing);

        double halfThing = half(8);
        System.out.println(halfThing);

        int roundPos = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundPos);

        int roundNeg = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundNeg);
    }

    // 1. add
    public static int add(int num1, int num2) {
        return (num1 + num2);
    }

    // 2. add
    public static int add(int num1, int num2, int num3, int num4) {
        return (num1 + num2 + num3 + num4);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return ("早上好, " + name + "!");
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return ("下午好, " + name + "!");
    }

    // 5. triple
    public static String triple(String string) {
        return(string + string + string);
    }

    // 6. half
    public static double half(int num) {
        return(num / 2.0);
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double num) {
        return((int)(num + 0.5));
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double num) {
        return((int)(num - 0.5));
    }

}
