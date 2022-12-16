public class Q11_FindtheMinArray {
    public static void main(String[] args) {

        int [] myArray = {3,5435,243,2346,345,234,65,46234,3};
        ArrayMethod(myArray);
    }
    public static int ArrayMethod(int [] param1){
        int minArray = param1[0];
        for (int i = 0; i < param1.length; i++) {
            if(param1[i]<minArray){
                minArray=param1[i];
            }

        }
        System.out.println("Minimum array is: "+minArray);
        return minArray;
    }
}
