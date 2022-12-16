import java.util.Arrays;

public class Q6_SameLettersString {
    public static void main(String[] args) {

        // Write a return method that check if a string is build out of the same letters as another string.

      //  Ex: same("abc", "cab"); -> true // // same("abc", "abb"); -> false:
        String first = "A,B,C";
        String second = "C,A,B";
        System.out.println(Mystring(first, second));

    }
    public static boolean Mystring(String param1, String param2){


        char[] ch1 = param1.toCharArray();
        char[] ch2 = param2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1="", a2="";
        for(char each: ch1) a1 +=each;
        for(char each: ch2) a2 +=each;

        return a1.equals(a2) ; } }


