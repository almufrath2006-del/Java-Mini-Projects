import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        int p=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number.");
        int a=sc.nextInt();
        System.out.println("Enter another number.");
        int b=sc.nextInt();
        System.out.println("Prime numbers between "+a+" to "+b+" are:");
        for(int i=a;i<=b;i++){
            int o=0;
            if(i!=1){
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        o++;
                    }
                }
                if(o==0){
                    System.out.print(i+" ");p++;
                }
            }
        }
        System.out.println("\nNumber of prime numbers are "+p+".");
    }
}