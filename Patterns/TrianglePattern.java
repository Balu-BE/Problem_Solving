public class TrianglePattern {
    public static void PatternH(int n){
        for(int row=1;row <= n;row++){
            for (int col = 0; col < n-(row-1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void PatternI(int n){
        for(int row=1;row <= n;row++){
            for (int col = 0; col < n-(row-1); col++) {
                System.out.print(n-(row-1));
            }
            System.out.println();
        }
    }
    public static void PatternJ(int n){
        for(int row=1;row <= n;row++){
            for (int col = 1; col <= n-(row-1); col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
