import java.util.Scanner;

public class problem8 {

    public static boolean isDigit(String ch){
        if(ch==null&&ch.isEmpty()){
            return false;
        }
        if(ch.length()==1){
            return Character.isDigit(ch.charAt(0));
        }
        return Character.isDigit(ch.charAt(0)) && isDigit(ch.substring(1));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();

        if(isDigit(ch)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
