import java.util.Scanner;

public class problem2 {
    public static double ave(int[] arr){
        double average=0;
        for(int i=0;i<arr.length;i++){
            average+=arr[i];
        }
        return average/arr.length;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(ave(arr));
    }
}