import java.util.Scanner;
public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array 1:");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the array1:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the array 2:");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the array2:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("The commom element between two arrays is: " + array1[i]);
                    break;
                }
            }
        }
    }
}
