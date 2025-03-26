import java.util.Arrays;

public class ArrayManipulation {
    static int arr [] = new int[]{2,4,1,5,6,2,3};
    static int lenArr = arr.length;
    public static void main(String [] args){
        stringReverse();
        numPattern();
        findMax(ArrayManipulation.arr);
        findMin(ArrayManipulation.arr);
        // printArray(ArrayManipulation.arr);
        // oddOrEven(ArrayManipulation.arr);
        int [] ascArr = ascendingOrder(ArrayManipulation.arr);
        System.out.println(Arrays.toString(ascArr));
        int descArr[] = descendingOrder(ArrayManipulation.arr);
        System.out.println(Arrays.toString(descArr));
        int secondLargest = secondLargest(ArrayManipulation.arr);
        System.out.println("second Max : "+secondLargest);
        int secondMin = secondMinimum(ArrayManipulation.arr);
        System.out.println("second Min : "+secondMin);
    }
    public static void printArray(int arr []){
        System.out.println("Printing the Elements of an array : ");
        for(int i = 0;i<lenArr;i++){
            System.out.println(arr[i]);
        }
    }
    public static void oddOrEven(int arr []){
        System.out.println("Odd Or Even Elements in Array : ");
        for (int i = 0; i < lenArr; i++) {
            if(arr[i] % 2 == 0){
                System.out.print(arr[i]+" , ");
            }else{
                System.out.println();
                System.out.print(+arr[i]+" , ");
            }
        }
    }
    public static void findMin(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(min > arr[j]){
                    min = arr[j];
                }
            }
        }
        System.out.println("Min element in Array : "+min);
    }
    public static void findMax(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(max < arr[j]){
                    max = arr[j];
                }
            }
        }
        System.out.println("Max element in Array : "+max);
    }
    public static int[] ascendingOrder (int arr[]){
        
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            for(int j = 0; j<len-1-i;j++){
                if( arr[j] > arr[j+1]){
                   int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] descendingOrder (int arr[]){
        
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            for(int j = 0; j<len-1-i;j++){
                if( arr[j] < arr[j+1]){
                    // a= a+b b = a-b a = a-b
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
             
                }
            }
        }
        return arr;
    }
    public static int secondLargest(int arr[]){
        int descArr[] = ascendingOrder(arr);
        int len = descArr.length;
        for (int i = len-2; i >=0; i--) {
            if(descArr[i] != descArr[len-1]){
                return descArr[i];
            }
        }
        return -1;
    }
    public static int secondMinimum(int arr[]){
        int descArr[] = descendingOrder(arr);
        int len = descArr.length;
        for (int i = len-2; i >=0; i--) {
            if(descArr[i] != descArr[len-1]){
                return descArr[i];
            }
        }
        return -1;
    }
    public static void numPattern(){
        int num = 5;
        for (int i = 0; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void stringReverse(){
        String word = "malayalam";
        StringBuilder reversed = new StringBuilder();
        System.out.println("String Reversing : ");
        for(int i = word.length()-1;i >=0;i--){
            // reversed += word.charAt(i);
            reversed.append(word.charAt(i));
        }
        System.out.println();
        System.out.println(reversed);
        if(word.equals(reversed.toString())){
            System.out.println("Given string is Palindrome");
        }else{
            System.out.println("Given string is Not a Palindrome");
        }
    }
}