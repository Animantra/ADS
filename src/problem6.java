import java.util.Scanner;

public class problem6 {
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(a,n));
    }
    public static int power(int a,int n){
        if(a==0 && n==0){
            return 1;
        }
        else if(n==0){
            return 1;
        }
        return a*power(a,n-1);
    }
}
