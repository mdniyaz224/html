import java.util.*;
public class aabc {
    public static void main(String[] args) {
        System.out.println("print reverce the no to take input to the user");
        Scanner sc = new Scanner(System.in);
        int no=sc.nextInt();
        int rev=0;
        int temp=no;
        int a=9;
        System.out.print(a%2);
        while(no>=1)
        {
            rev=rev*10+no%10;
            no=no/10;

        }
        if(temp==rev)
        {
            System.out.print("yes this is ");
        }
        else
         {
            System.out.println("no this is not this is "+rev);
        }
    }
}
