public class Q3_WordToWordReverse {
    public static void main(String[] args) {

        String str = "Todays is Sunday" ;
        String reversed = "" ;
        String[] array = str .split( " " );
        for (int i = array.length-1; i >=0 ; i--) {
            reversed=reversed+array[i];
        }
        System.out.println(reversed);
    }
}
