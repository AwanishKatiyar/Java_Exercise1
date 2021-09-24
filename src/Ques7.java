public class Ques7 {
    static String firstName = "Awanish";
    static String lastName = "Katiyar";
    static int age = 22;
    private static void print(){
        System.out.println("In static method");
        System.out.println("Awanish Katiyar 22");
    }
    public static void main(String[] args) {
        System.out.println("In main");
        System.out.println(firstName + " " + lastName + " " + age);
        print();
    }
    static {
        System.out.println("In static block");
        System.out.println("Awanish Katiyar 22");
    }
}
