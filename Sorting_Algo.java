public class Sorting_Algo {
    public static void main(String[] args) {
        int arr[]={5,3,2,4,7,8,1,5};

        int min =Integer.MIN_VALUE;

        for (int i=0;i< arr.length;i++){

            if (arr[i]>min){

                min=arr[i];
            }
        }

        System.out.println(min);
    }
}
