public class Ques10 {
    private static int add(int a, int b) {
        return a + b;
    }
    private static double add(double a, double b) {
        return a + b;
    }
    private static float multiply(float a, float b) {
        return a * b;
    }
    private static int multiply(int a, int b) {
        return a * b;
    }
    private static String concat(String a, String b) {
        return a + b;
    }
    private static String concat(String a, String b, String c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(add(3,5));
        System.out.println(add(9.2,32.8));
        System.out.println(multiply(7,3));
        System.out.println(multiply(7.2f,9.8f));
        System.out.println(concat("Hello"," World"));
        System.out.println(concat("Hello"," World","!"));
    }
}
