/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Fiona Wong
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

        int addResult = add(12,13);
        System.out.println(addResult);

        int addResult2 = add(12,13,14,15);
        System.out.println(addResult2);

        String morningGreetingResult = morningGreeting("Fiona");
        System.out.println(morningGreetingResult);

        String afternoonGreetingResult = afternoonGreeting("Fiona");
        System.out.println(afternoonGreetingResult);

        String tripleResult = triple("Hello!");
        System.out.println(tripleResult);

        double halfResult = half(23);
        System.out.println(halfResult);

        int roundPositiveValueToNearestIntegerResult = roundPositiveValueToNearestInteger(12.13);
        System.out.println(roundPositiveValueToNearestIntegerResult);

        int roundNegativeValueToNearestIntegerResult = roundNegativeValueToNearestInteger(-12.13);
        System.out.println(roundNegativeValueToNearestIntegerResult);

    }

    // 1. add
    public static int add(int a, int b){
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d){
        return add(add(a, b), add(c, d));
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String str){
        return str + str + str;
    }

    // 6. half
    public static double half(int num){
        return num/2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double num){
        return (int) (num + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double num){
        return (int) (num - 0.5);
    }

}
