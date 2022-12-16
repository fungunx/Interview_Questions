import java.util.Arrays;

public class Q5_Concate_TwoStringArrays {
    public static void main(String[] args) {

        //Write a return method that can concat two arrays

        int [] a = {1,2,3,4};
        int [] b = {5,6,7,8};
        System.out.println("concte(a,b) = " + concate(a, b));

        }
        public static String concate(int [] a,int [] b ){
            int[] twoOfThem = new int[a.length + b.length];
            for (int i = 0; i < a.length; i++) {
                twoOfThem[i]=a[i];
            }
            for (int i = 0; i < b.length; i++) {
                twoOfThem[a.length+i]=b[i];
            }

            return Arrays.toString(twoOfThem);
        }
}
