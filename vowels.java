import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        char[]vow={'a','e','i','o','u'};
        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.println("Enter a word");
        String name=sc.nextLine();
        for (int j=0;j<name.length();j++) {
            for (char string : vow) {
                if(name.charAt(j)==string){
                    i++;
                }
            }
        }
        if(i==0){
            System.out.println("Not vowel word");
        }
        else{
            System.out.println("vowels Word");
        }     
    }
} 