public class Q17_SumofDigitsInTheString {
    public static void main(String[] args) {

        int [] numbers = {4,3423,5,2,3,5234,235,1};

        sumOfDigits("5");

    }public static int sumOfDigits(String s) {
    int total = 0;
    char [] ch =s.toCharArray();
    for (char each : ch){
        if (Character.isDigit(each)){
            total=total+Integer.valueOf(" "+each);
        }
    }
        return total;
    }}
