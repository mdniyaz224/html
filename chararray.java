public class chararray {
    public static void main(String[] args) {

        char arr[] = new char[] { 'n', 'i', 'y', 'a', 'z' };

        for (int i = arr.length - 1; i >=0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
    }
}