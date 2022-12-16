public class Q18_alphaCharacters {
    public static void main(String[] args) {

        String str = " Hih9898jhjh%%^$%^ oio " ;
        str = str.replace("[^A Za z]" , "");
        int number=str.length();
        System. out .println( "Number of alpha character = " + number );

    }

}
