public class Q1_Reverse_String {
    public static void main(String[] args) {
        // Write a string and reverse it.

        String st = "Hello World";
        String reverse = "";

        for (int i = st.length()-1 ; i >= 0; i--) {
           reverse = reverse + st.charAt(i);

        }
        try {
            System.out.println("Reverse of st value is : "+reverse);

        } catch (Exception e) {
            System.out.println("Something went wrong!!");
        }


    }}
