import java.util.Scanner;
public class MArray {
    
    public static void main(String ar[]){
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter two size:");
        int s1=s.nextInt();
        int s2=s.nextInt();
        
        int arr[][] = new int[s1][s2];
        
        System.out.println("Enther the  metrix");
        for (int i=0; i<s1; i++){
            for(int j=0; j<s2; j++){
                arr[i][j]=s.nextInt();
                
            }
            
        }
        
        for (int i=0; i<s1; i++){
            for(int j=0; j<s2; j++){
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
            
        }
    
    }
}