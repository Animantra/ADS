import java.util.ArrayList;
import java.util.Scanner;

public class problem7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        reverse(list, n - 1);
    }
    public static void reverse(ArrayList<Integer> list, int n){
        if (n < 0) {
            return;
        }
        System.out.print(list.get(n) + " ");
        reverse(list, n - 1);
    }
}
