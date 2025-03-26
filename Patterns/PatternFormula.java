

import java.util.Scanner;

public class PatternFormula {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the N : ");
        int n = scanner.nextInt();
        squareHollow(n);

        scanner.close();
    }
    public static void squareHollow(int n){
        for(int i=0;i < n;i++){
            for (int j = 0; j < n; j++) {
                if(i==1 || i==n-1 || j==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
