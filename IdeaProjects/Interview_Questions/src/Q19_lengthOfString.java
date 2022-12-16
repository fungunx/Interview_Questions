public class Q19_lengthOfString {

    public static void main(String[] args) {
        /*
        Length of string ignore space
         */

        String str = "Steve Jobs";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=' '){
                count ++;}
            }
        System.out.println(count);
        }
    }

