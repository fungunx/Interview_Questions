public class Q9_finTheMaxArray {
    public static void main(String[] args) {
        /*
        Write a method that can find the maximum number from an int Array

         */
        int [] Array1 = {9,3,5,3,6,1,753434,3,232,13215,5};

        Max(Array1);
    }
    public static int Max(int [] ArrayTry){
        int maxArray = ArrayTry[0];
        for (int i = 0; i < ArrayTry.length; i++) {
            if (ArrayTry[i] > maxArray){
                maxArray=ArrayTry[i];

            }

        } System.out.println(maxArray);

        return maxArray;
    }
}
