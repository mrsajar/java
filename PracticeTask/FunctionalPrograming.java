package PracticeTask;

import java.util.function.Function;

public class FunctionalPrograming {
    public static void main(String[] args) {
        Function<Integer,Integer> f = i->i*i;
        System.out.println("the square of the number is: " +f.apply(20));
        System.out.println("the square of the number is: " +f.apply(10));
    }
}
