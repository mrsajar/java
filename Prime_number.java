class Prime{
    public void find_prime(int number){
        int m=number/2;
        boolean flag=true;
        if(number==0||number==1){
            System.out.println(number+"the number is not prime....");
        }
        else {
            for (int i = 2; i < m; i++) {
                if (number % i == 0) {
                    System.out.println(number + "the number is  not prime...");
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(number + "the numer is prime....");
            }
        }
    }
}
public class Prime_number {
    public static void main(String[] args) {
        Prime obj=new Prime();
        obj.find_prime(6);

    }
}
