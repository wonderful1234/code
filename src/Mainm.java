import java.util.Scanner;
        import java.util.Stack;         //洛谷中缀表达式

public class Mainm {
    public static void main(String[] args) {
        int i=0,n;
        long a=0,b,c;
        String l;
        char d;
        Stack <Long> o = new Stack<>();
        Stack m = new Stack();
        Scanner reader=new Scanner(System.in);
        l=reader.next();
        for(i=0;i<l.length();i++){
            d=l.charAt(i);
            if(d>='0'&&d<='9'){
                a=a*10+(d-'0');
            }
            else {
                o.push(a);
                a=0;
                if(m.isEmpty()==true){
                    m.push(d);
                }
                else {
                    b=o.pop();
                    c=o.pop();
                    if((char)m.peek()=='+'){
                        o.push(b+c);
                    }
                    if((char)m.peek()=='-'){
                        o.push(c-b);
                    }
                    m.pop();
                    m.push(d);
                }
            }
        }
        b=o.pop();
        if((char)m.pop()=='+'){
            System.out.println(b+a);
        }
        else {
            System.out.println(b-a);
        }

    }
}
