public class palindrom {
    public static void main(String[] args) {
        int no=131;
        int rem,sum=0,temp;
        temp=no;
        while(no>0)
        //for(int i=no; i>0; i--)
        {
            rem=no%10;
            sum=sum*10+rem;
            no=no/10;
            System.out.println(no);
            System.out.println(sum);

        }
        no=temp;
        if(no==sum)
        {
            System.out.println("no is a plendrom "+no);
        }
        else{
            System.out.println("no is not a plendrom "+no);
        }
    }
}