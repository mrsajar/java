public class Sorting_AlgoMax {
    public static void main(String[] args) {
        int arr[]={5,3,1,9,6,8,23,11};

        int min=Integer.MIN_VALUE;

        for (int i=0;i< arr.length;i++){

            if (arr[i]>min){

                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
