import java.util.Scanner;

public class IfElse {

    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a  number");

        int n = Sc.nextInt();

        if(n<0){
            System.out.println("negative number");
        }else {
            System.out.println("Positive number");
        }
        }
    
}
