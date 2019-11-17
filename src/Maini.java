import java.util.Scanner;

public class Maini {
    public static void main(String[]args){
        int i,suma=0,sumb=0,sumc=0;
        String str,str1,str2;
        Scanner reader=new Scanner(System.in);
        str=reader.nextLine();
        str1= str.replaceAll(" +","");
        str2=str1.toLowerCase();
        for(i=0;i<str2.length();i++){
            char c=str2.charAt(i);
            if (c >= 'a' && c <= 'z'){
                suma++;
            }
            else if(c>='0'&&c<='9'){
                sumb++;
            }
            else {
                sumc++;
            }
        }
        System.out.println("a-z"+" "+suma);
        System.out.println("0-9"+" "+sumb);
        System.out.println("others"+" "+sumc);
    }
}
