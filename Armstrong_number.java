class Armstrong_num {
        public void find_number(int number) {
            int temp = number;
            int reminder = 0;
            int reverse = 0;
            while (number > 0) {
                reminder = number % 10;
                reverse = reverse + reminder * reminder * reminder;
                number = number / 10;
            }
            if (temp == reverse) {
                System.out.println("the number is armstrong");
            } else {
                System.out.println("the numbet is not armstrong.....");
            }


        }
    }
    public class Armstrong_number{
    public static void main(String[] args) {
        Armstrong_num obj=new Armstrong_num();
        obj.find_number(153);

    }
}
