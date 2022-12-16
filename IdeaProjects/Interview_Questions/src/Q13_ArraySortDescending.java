public class Q13_ArraySortDescending {
    public static void main(String[] args) {
       /*
        Write a return method that can sort an int array in descending order without using the
        sort method of the Arrays class // //
         Ex: int[] arr = {10,20,70, 80, 90}; // // arr = Sort(arr); ==> {90, 80, 70, 20, 10};
         */
            int[] arr = {10,20,70, 80, 90};
            number(arr);

        }public static void number(int [] param1){

        for (int i = param1.length-1; i >=0; i--) {
            String count = "";
            //System.out.println(param1[i]);
            count=count+param1[i];
            System.out.print(count+" ");
            }

        }

            }







