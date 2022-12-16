import java.time.temporal.Temporal;
import java.util.Arrays;

public class Q12_concate2_Arrays {
    //Concat2Arrays
    public static void main(String[] args) {

        int [] a = {23,423,14324,132123,4};
        int [] b = {34324,3423,143425,2341,545};
        System.out.println(concatee(a, b));

    }
    public static String concatee(int [] param1,int [] param2){
        int [] TwoArray = new int[param1.length+param2.length];
        for (int i = 0; i < param1.length; i++) {
            TwoArray [i] = param1[i];
        }
        for (int i = 0; i < param2.length; i++) {
            TwoArray[param1.length+i] = param2[i];
        }


        return Arrays.toString(TwoArray);
    }
}
