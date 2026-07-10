import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        while(true){
            long n=1;
            int a=sc.nextInt();
            if(a!=0){
                for(int i=1;i<=a;i++){
                    n=n*i;
                }
                System.out.println(n);
            }
            else{
                break;
            }
        }
    }
}
