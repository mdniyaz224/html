public class prime {
    public static void main(String[] args) {
        System.out.println("prine the prime no");
        int no=10;
        int count=0;
        for(int i=2; i<no; i++){
            if(no%i==0){
             count ++;
            }
        }
        if(count==2)
        {
            System.out.println("this is not a prime no");
        }
        else{
            System.out.println("this is a prime no");
        }
    }
}
