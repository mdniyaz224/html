public class findindexofelement {
    public static void main(String[] args) {
        int arr[]= new int []{1,2,3,5,4};
	    int ind=-1;
	    for(int i=0; i<arr.length; i++)
	    {
	        if(arr[i]==5)
	        {
	            ind=i;
	        }
	    }
		System.out.println(ind);
    }
}
