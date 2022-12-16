public class Q2_Reverse_Array {
    public static void main(String[] args) {
        // Write a String Array and reverse it!!

        String [] myarray = {" Galatasaray "," Fenerbahce "," Besiktas "};
        String reversed = "" ;
        //char [] array = reversed.toCharArray();
        for (int i = myarray.length-1; i >=0 ; i--) {
            reversed=reversed+myarray[i];

        }
        System.out.println(reversed.toString());

    }
}
