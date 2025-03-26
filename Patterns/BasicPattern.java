public class BasicPattern{
    public static void main(String[] args) {
        int [] inputArray ={3,5,7};
        for(int i : inputArray){
            // PatternA(i);
            // PatternB(i);
            // PatternC(i);
            // PatternD(i);
            // PatternE(i);
            // PatternF(i);
            // PatternG(i);
            // TrianglePattern.PatternH(i);
            // TrianglePattern.PatternI(i);
            // TrianglePattern.PatternJ(i);
            // ComboPattern.PatternK(i);
            // ComboPattern.PatternL(i);
            // ComboPattern.PatternM(i);
            // ComboPattern.PatternN(i);
            // ComboPattern.PatternO(i);
            // ComboPattern.PatternP(i);
            // ComboPattern.difficultLevel1(i);
            ComboPattern.difficultLevel2(i);
            line(i);
        }
        
    }


    public static void line(int n){
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println(" Test Case "+ n);
        System.out.println();
    }
    public static void PatternA(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void PatternB(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n; col++) {
                if(row==1 || row==n || col==1 || col==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void PatternC(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void PatternD(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
    public static void PatternE(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void PatternF(int n){
        for (int row = 1; row <=n; row++) {
            int value = row % 2 == 0 ? 0 : 1;
            for (int col = 1; col <=row; col++) {
                System.out.print(value+" ");
                value = value^1 ;
            }
            System.out.println();
        }
    }
    public static void PatternG(int n){

        int value = 1;
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }
    }
}