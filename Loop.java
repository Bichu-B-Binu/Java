
import java.util.Scanner;


public class Loop {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a size:");
        int size = sc.nextInt();
        
           int arr[] = new int [size];
        
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered numbers are :");
        for(int i=0;i<size;i++){
            System.out.println(+arr[i]);
        }
        
    }
}
