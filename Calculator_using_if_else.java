import java.util.Scanner;
class Operation{
    public void perform(){
        int sign,ans;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the sign what you want to perform a operation..");
        sign=in.next().charAt(0);

        System.out.println("enter the value of a..");
        int a=in.nextInt();
        System.out.println("enter the value of b...");
        int b=in.nextInt();
        if(sign=='+'){
            ans=a+b;
            System.out.println("the answer of this operation..."+ans);
        }
        else if(sign=='-'){
            ans=a-b;
            System.out.println("the answer of this operation..."+ans);
        }
        if(sign=='*'){
            ans=a*b;
            System.out.println("the answer of this operation..."+ans);
        }
        else if(sign=='/'){
            ans=a/b;
            System.out.println("the answer of this operation..."+ans);
        }
    }
}
public class Calculator_using_if_else {
    public static void main(String[] args) {
        Operation operation=new Operation();
        operation.perform();
    }
}
