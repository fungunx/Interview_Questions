import java.util.ArrayList;

public class Q15_Odd_Even_Number {
/*
Write a method which can identifies given number is even or odd
 */
public static void main(String[] args) {
    int[] nre = {4, 5, 234, 425, 23, 513, 45, 23, 234, 1, 5413, 5,2};
    number(nre);
}
public static void number (int[] a){
    System.out.println("Odd Numbers:");
    for(int i=0;i<a.length;i++){
        if(a[i]%2!=0){
            System.out.print(a[i]+" ");

        }
    }
    System.out.println("\nEven Numbers:");
    for(int i=0;i<a.length;i++){
        if(a[i]%2==0){
            System.out.print(a[i]+" ");
        }

    }
}}

