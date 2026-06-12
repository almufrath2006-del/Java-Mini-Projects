import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        String[]vow={"a","e","i","o","u"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String name=sc.nextLine();
        for(int i=0;i<name.length();i++){
            for (String j : vow) {
                if(j.equals(name.charAt(i))){
                System.out.println("vowels word");
                }
            }
        }
    } 
}
