package test;

public class PlusOne_Test {

    public static void main(String[] args) {

//        int[] digits = {1, 2, 3};
//        int[] digits = {9,9,9};
//        int[] digits = {9,8,9};
//        int[] digits = {8,9,9};
        int[] digits = {0,0,1};


        int[] result = plusOne(digits);
        for (int i : result)
            System.out.println(i);
    }

    static int[] plusOne(int[] digits) {

        int index = digits.length - 1;
        int carry = 1;

        while (index >= 0 && carry > 0){

            digits[index] = (digits[index] + 1) % 10;

            if (digits[index] == 0){
                carry = 1;
            }else{
                carry = 0;
            }
            --index;
        }

        if (carry == 1){
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }


        return digits;
    }
}
