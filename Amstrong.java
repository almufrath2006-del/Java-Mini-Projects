import java.util.*;
public class Amstrong {
    public static void main(String[] mufrath) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int m=sc.nextInt();
        System.out.println("Enter Another Number:");
        int n=sc.nextInt();
        int p=0;
        for(int a=m;a<=n;a++){
            String astr=""+a;
            int b=1;
            int c=0;
            for(int i=0;i<astr.length();i++){
                String str=""+astr.charAt(i);
                int o=Integer.parseInt(str);
                for(int j=0;j<astr.length();j++){
                    b*=o;
                }
                c+=b;b=1;
            }
            if (c==a) {
                System.out.print(" "+a);p++;
            }
        }
        System.out.println("\nTotal Amstrong Numbers Between "+m+" and "+n+" are:"+p);
    }
}