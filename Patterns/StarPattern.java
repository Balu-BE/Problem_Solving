import java.util.Scanner;

public class StarPattern {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the No of rows : ");
        int n = sc.nextInt();
        square(n);
        LeftTriangle(n);
        RightTriangle(n);
        LeftDownTriangle(n);
        RightDownTriangle(n);
        Triangle(n);
    }

    public static void square(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void LeftTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void RightTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("  ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void LeftDownTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void RightDownTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int k=5;k>i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Triangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("  ");
            }
            for(int k=0;k<2*i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}