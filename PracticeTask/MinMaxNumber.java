package PracticeTask;

public class MinMaxNumber {
    public static void main(String[] args) {
        int Max=Integer.MIN_VALUE;
        int Min=Integer.MAX_VALUE;
        int arr[]={5,3,2,7,9,8,4,56,8,32,8};

        for (int i=0;i< arr.length;i++) {

            if (arr[i] <Min) {
                Min = arr[i];
            }
            else if (arr[i]>Max){
                Max=arr[i];
            }
        }
        System.out.println("min number of the array"+Min+"And " +
                "max number of the array "+Max);
    }
}
