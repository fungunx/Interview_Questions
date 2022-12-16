public class Q7_RemoveDuplicatesString {
    public static void main(String[] args) {
        // Write a code and remove duplicates string

        String str="ffttrerrssdakkkiirtrfdfd";

        System.out.println(duplicates(str));
    }public static String duplicates(String param1){
        String result = "";
        for (int i = 0; i < param1.length(); i++) {
            if (!result.contains(""+param1.charAt(i))){
                result=result+param1.charAt(i);
            }

        }

        return result;
    }

}
