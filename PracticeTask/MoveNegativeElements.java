package PracticeTask;

import java.util.Arrays;

public class MoveNegativeElements {
    public static void main(String[] args) {
        int arr[]={3,5,7,8,-5,-2,8,1};

        Arrays.sort(arr);

        for(int e:arr){

            System.out.println(e);
        }
    }
}
