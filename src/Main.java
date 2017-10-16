import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b,c,d,e;
        b=(a/1000+7)%10;
        c=(a/100%10+7)%10;
        d=(a/10%10+7)%10;
        e=(a%10+7)%10;
        System.out.printf("%d%d%d%d\n",d,e,b,c);
    }
}