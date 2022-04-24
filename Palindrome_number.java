class Palindrome{
    public void find_palindrome(int number){
        int temp= number;
        int reminder;
        int reverse=0;
        while (number>0){
            reminder=number%10;
            reverse=reverse*10+reminder;
            number=number/10;
        }
        if(temp==reverse){
            System.out.println("the number is palindrome..");
        }
        else{
            System.out.println("the number is not palindrome...");
        }

    }
}
public class Palindrome_number {
    public static void main(String[] args) {
        Palindrome obj=new Palindrome();
        obj.find_palindrome(121);

    }
}
