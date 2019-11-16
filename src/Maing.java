import java.util.Scanner;

public class Maing {
    public static void main(String []args){
        int m,i;
        double b;
        double a;
        double p;
        System.out.println("请输入数据组数");
        Scanner reader=new Scanner(System.in);
        m=reader.nextInt();

        double[]x=new double[m];
        double[]y=new double[m];
        System.out.println("请输入x");
        for (i=0;i<x.length;i++)
        {
            x[i]=reader.nextDouble();
        }
        System.out.println("请输入y");
        for (i=0;i<y.length;i++)
        {
            y[i]=reader.nextDouble();
        }
        a = (m * multxy(x,y))-(addx(x)*addy(y));
        b=(m*multxx(x))-(Math.pow(addx(x),2));
        System.out.println("斜率:"+a/b);
        System.out.println("x平均:"+addx(x)/m);
        System.out.println("y平均:"+addy(y)/m);
        p=Math.sqrt(((multxx(x)/m)-(addx(x)/m)*(addx(x)/m))*((multyy(y)/m)-(addy(y)/m)*(addx(y)/m)));
        double xian=((multxy(x,y)/m)-(addx(x)/m)*(addy(y)/m))/p;
       // System.out.println("非线性度"+xian);

    }
    public static double addx(double[] x){
        int j;
        double sumx=0;
        for(j=0;j<x.length;j++) {
            sumx += x[j];
        }
        System.out.println("x求和为"+sumx);
        return sumx;
    }
    public static double addy(double[] y){
        int j;
        double sumy=0;
        for(j=0;j<y.length;j++) {
            sumy += y[j];
        }
        System.out.println("y求和为"+sumy);
        return sumy;
    }
    public static double multxy(double[] x, double[] y){
        int i;
        double sumxy=0;
        for(i=0;i<x.length;i++){
            sumxy+=x[i]*y[i];
        }
        System.out.println("x*y求和为"+sumxy);
        return sumxy;
    }
    public static double multxx(double[] x){
        int k;
        double sumxx=0;
        for (k=0;k<x.length;k++){
            sumxx+=Math.pow(x[k],2);
        }
        System.out.println("x平方求和为"+sumxx);
        return sumxx;
    }
    public static double multyy(double[] y){
        int k;
        double sumyy=0;
        for (k=0;k<y.length;k++){
            sumyy+=Math.pow(y[k],2);
        }
        System.out.println("y平方求和为"+sumyy);
        return sumyy;
    }

}
