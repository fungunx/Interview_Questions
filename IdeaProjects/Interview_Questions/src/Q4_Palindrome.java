public class Q4_Palindrome {
    public static void main(String[] args) {
        // Write a world and check if it Palindrome or not

        String Palindrome = "kayak";
        String Result="";
        for (int i = Palindrome.length()-1; i >=0 ; i--) {
            Result = Result + Palindrome.charAt(i);
        }{
            if (Palindrome.equals(Result)){
                System.out.println(Palindrome+" is a Palindrome world");
            }else {
                System.out.println(Palindrome+" is not a Palindrome world");
            }
            {
            }
        }
    }
}
