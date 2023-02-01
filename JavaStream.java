public class JavaStream {
    public  static  void  main(String[] args){
        int arr[]={2,5,7,5,34,32,};

        for(int i=0;i<arr.length;i++){

            for (int j=i+1;j< arr.length;j++){

                if (arr[i]>arr[j]){

                    int local=arr[i];

                    arr[i]=arr[j];

                    arr[j]=local;
                }
            }
        }
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}
