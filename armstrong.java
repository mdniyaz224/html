public class armstrong {
    public static void main(String[] args) {
        int no=152;
        int sum=0,rem,temp,qub;
        temp=no;
        while(no>0)
        {
            rem=no%10;
            qub=rem*rem*rem;
            sum=sum+qub;
            no=no/10;
            rem=0;
            //qub=0;
        }
        no=temp;
        if(no==sum)
        {
            System.out.println("no is a armstrong"+sum);
        }
        else
        {
            System.out.println("no is not a armstrong"+sum); 
        }
    }
   
}
