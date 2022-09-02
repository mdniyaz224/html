public class armst {
    public static void main(String[] args) {
        int no=153,check;
        int rem,sum=0,qub=1;
        check=no;
        while(no>0){
            rem=no%10;
           qub=rem*rem*rem;
           System.out.println(qub);
           sum=qub+sum;
           qub=0;
           no=no/10;
           System.out.println(sum);
        }
        if(check==sum)
        {
         System.out.println("this no is armstrong ");
        }
    }
}
