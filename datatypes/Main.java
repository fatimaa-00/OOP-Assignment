import java.util.*;
class variables {
    public  static void main (String args[]){
        System.out.println("variable for Datatypes .");
        Scanner ob = new Scanner(System.in);
        int number;
        float number1;
        char alphabet;
        System.out.println("Enter the Integer type data: ");
        number = ob.nextInt();
        System.out.println(number);
        System.out.println("Enter the Float type data: ");
        number1 = ob.nextFloat();
        System.out.println(number1);
        System.out.println("Enter the character type data: ");
        alphabet = ob.next ().charAt(0);
        System.out.println(alphabet);


    }
}