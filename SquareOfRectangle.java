package DailyQue;

import java.util.Scanner;

public class SquareOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0){
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int b1=sc.nextInt();
            int b2=sc.nextInt();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            if((a1==b1 && b1==c1 && a2+b2+c2==a1)||(a2==b2 && b2==c2 && a1+b1+c1==a2)||(a1==(b1+c1) && a2+b2==a1 && b2==c2) || ((a1+b1)==a2 && a2==(b2+c2) && b1==c1) || ((a1+b2)==a2 && a2==(b1+c1) && b1==c1)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
