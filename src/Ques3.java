import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        int Charlength = str.length();
        str = str.replaceAll(Character.toString(ch), "");
        int Charwithoutlength = str.length();
        System.out.println(Charlength - Charwithoutlength);
    }
}
