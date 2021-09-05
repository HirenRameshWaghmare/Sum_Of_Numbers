package com.nisren.fibinacci;

public class Main {

    public static void main(String[] args) {
        /**
         * 1. Recursive Case
         * 2. Base/Termination Case
         * 3. Unintentional/Out of Syllabus Case
         * Formula:- f(n) = n%10 + f(n/10)
         * eg:
         * 10=1+0
         * 54=5+4
         * 112=1+1+2
         */
        Main recursion = new Main();
        int result = recursion.sumOfDigits(112);
//        int ret = recursion.sumOfDigits((int) 123.2);
        System.out.println(result);
    }
    public int sumOfDigits(int number){
        //Base/Termination Case and invalid input(number < 0 )
        if (number==0 || number<0){
            return 0;
        }
        //Recursive case
        return number%10 + sumOfDigits(number/10);
    }
}
