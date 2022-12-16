public class Q22_ArmstrongNumber {

    /*
    Let us look at what is Armstrong number by taking the number 122. In base 3 to check if 122 is an
    Armstrong no, perform the operation 1^3 2^3 2^3=17. In base 3 the operation is the same as 2*1 2*3 1*9=17.
    Important to note here is that 3 to the power of zero is equal to 1,
    and 3 to the power of 1 is 3, and 3 to the power of two is 9.
    Totalling the terms obtained we get 17. This means that an Armstrong number can exhibit the same property in any given number system.+ For 0, the operation is 0^1=0
    For 1, the operation is 1^1=1
    For 153, the operation is 1^3 5^3 3^3=153
    For 370 the operation is 3^3 7^3 0^3=370
    For 371 the operation is 3^3 7^3 1^3=371
    For 407 the operation is 4^3 0^3 7^3=407
     */
    public static void main(String[] args) {

        int number = 407;
        Amstrong(number);

    }public static void Amstrong(int param1){
        int sum = 0;
        int backUp = param1;
        while (param1>0){
            sum+=(param1%10)*(param1%10)*(param1%10);
            param1=param1/10;

        }if (sum==backUp){
            System.out.println("This is a Armstrong Number");
        }else {
            System.out.println("This is not a Armstrong Number");
        }

        }
    }

