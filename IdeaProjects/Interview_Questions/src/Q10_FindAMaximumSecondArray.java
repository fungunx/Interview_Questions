public class Q10_FindAMaximumSecondArray {
    public static void main(String[] args) {

        /*
        Find the 2. largest Maximum Array
         */

        int [] ScondMax = {9,4,234,14,545,324324,645235};
        MyArray(ScondMax);

    }public static int MyArray(int [] param1){
        int max2 = param1 [0];
        for (int i = 0; i < param1.length-1; i++) {
            if (param1[i]>max2){
                max2=param1[i];
            }

        }
        System.out.println(max2);

        return max2;
    }

}
