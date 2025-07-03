import java.util.Scanner;
public class Sorting{
    
    public static void main(String ar[]){
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter the Size:");
        int n = s.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter the numbers:");
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
        
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j < n; j++){
                if(arr[i]>arr[j]){
                    
                    int swap= arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                    
                }
            }
        }
        System.out.println("Sorted:");
        for(int i=0; i < n; i++){
            
            System.out.println(arr[i]);
        }
    }
}