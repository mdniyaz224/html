public class sumofint {
    public static void main(String[] args) {
        int no=123;
        int rev=0,sum=0;
        System.out.println("print the sum of the no ");
        while(no>0){
            rev=rev*10+no%10;
            System.out.println(rev);
            sum=rev+sum;
            rev=0;
            no=no/10;
        }
        System.out.println(sum);
    }
}
