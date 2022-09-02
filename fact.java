public class fact {
    public static void main(String[] args) {
        System.out.println("print the factriol of the given no ");
        int no=5,sum=1;
        for(int i=no; i>0; i--)
        {
            System.out.println(i);
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
