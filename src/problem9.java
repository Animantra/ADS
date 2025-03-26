import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(binominal(n,k));
    }

    public static int binominal(int n,int k){
        if(k==0||k==n){
            return 1;
        }
        return binominal(n-1,k-1)+binominal(n-1,k);
    }
}
