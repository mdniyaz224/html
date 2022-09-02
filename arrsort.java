public class arrsort {
    public static void main(String[] args) {
        int arr[] = new int[] { 0,1,0,1 ,1,1,1,0,0,0};
        int temp;
        System.out.println("sort this array ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("print sorter array");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
