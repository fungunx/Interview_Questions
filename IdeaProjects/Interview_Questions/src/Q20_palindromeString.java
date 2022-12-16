public class Q20_palindromeString {
    public static void main(String[] args) {
        String plndrm = "kayak";
        Palindrome(plndrm);
    }public static void Palindrome( String param1){

        String reverse = "";
        for (int i = param1.length()-1; i >=0 ; i--) {
            reverse = reverse+param1.charAt(i);


        }  if (param1.equals(reverse)){
            System.out.println("Palindrome");

        }else {
            System.out.println("not a palindrome");


        }
    }
}
