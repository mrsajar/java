public class Sorting_Algo {
    public static void main(String[] args) {
        int arr[]={5,3,2,4,7,8,1,5};

        int max =Integer.MAX_VALUE;

        for (int i=0;i< arr.length;i++){

            if (arr[i]<max){

                max=arr[i];
            }
        }

        System.out.println(max);
    }
}
