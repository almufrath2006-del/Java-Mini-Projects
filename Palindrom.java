import java.util.*;
public class Palindrom {
    public static void main(String[] args) {
        Scanner muf=new Scanner(System.in);
        int j=0;
        int r=0;
        System.out.println("Enter word or numbers:");
        String pal=muf.nextLine();
        int num=pal.length()/2;
        for(int i=0;i<num;i++){
            r++;
            if(pal.charAt(i)==pal.charAt(pal.length()-r)){
                j++;
            }
        }
        if(j==num){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
    }
}