import java.util.Scanner;

public class Mainl {
    public static void main(String[] args) {
        String s=new String();
        int i,count=0;
        Scanner reader=new Scanner(System.in);
        s=reader.next();
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
