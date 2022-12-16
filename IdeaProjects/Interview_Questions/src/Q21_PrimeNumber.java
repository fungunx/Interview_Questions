public class Q21_PrimeNumber {
    public static void main(String[] args) {
        int number = 13;
        System.out.println(primeNumber(number));


    }public static boolean primeNumber(int param1){
        boolean yesNo= true;
        for (int i = 2; i < param1; i++) { // i can be prime, not divisible by 1, start 2..
            if (param1%i==0){
                yesNo=false;
            }else {

            }
        }
        return yesNo;
    }
}
