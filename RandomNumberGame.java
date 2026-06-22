import java.util.*;
public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner muf=new Scanner(System.in);
        Random r=new Random();
        System.out.println("I gussed,Enter number.");
        int rand=r.nextInt(100);
        int b=0;
        int a=muf.nextInt();
        while (a!=rand) {
            if (a<rand) {
                System.out.println("Less.");
                a=muf.nextInt(); b++;
            }
            else if (a>rand) {
                System.out.println("greater");
                a=muf.nextInt();b++;
            }
        }  
        if (a==rand) {
            b++;
            if(b==1){
            System.out.println("single attempts "+"brillient");
            }
            else if(b>1&&b<=5){
                System.out.println(b+" attempts "+"very good");
            }
            else{
                System.out.println(b+" attempts "+"good");
            }
        }
    }
}

