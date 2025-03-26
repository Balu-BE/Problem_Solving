public class ComboPattern {
    public static void PatternK(int n){
        for (int row = 1; row <= (2*n)-1 ; row++) {
            int value = row > n ? (2*n)-row : row;
            for (int col = 1; col <= value; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void PatternL(int n){
        for (int row = 1; row <= n ; row++) {
            for(int space = 1;space <= n-(row-1);space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void PatternM(int n){
        for (int row = 1; row <= n ; row++) {
            for(int space = 1;space <= row-1;space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= n-(row-1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void PatternN(int n){
        for (int row = 1; row <= (2*n)-1 ; row++) {
            int rowChange = row > n ? (2*n)-row : row;
            for (int col = 1; col <= rowChange; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void PatternO(int n){
        for (int row = 1; row <= (2*n)-1 ; row++) {
            int spaceChange = row > n ? row-n : n-row;
            int starChange = row > n ? (2*n)-row  : row;
            for (int space = 1; space <= spaceChange; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= starChange; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void PatternP(int n){
        for (int row = 1; row <= (2*n)-1 ; row++) {
            int spaceChange = row > n ? (2*n)-row : row-1;
            int starChange = row > n ? row-n  : (n-row)+1;
            for (int space = 1; space <= spaceChange; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= starChange; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void difficultLevel1(int n){
        for (int row = 1; row <= 2*n ; row++) {
            for (int star = 1; star <= (n*2)-(row-1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void difficultLevel2(int n){
        for (int row = 1; row <= (2*n)-1 ; row++) {
           
                for (int col = 1; col <= (2*n)-1; col++) {
                    int top = row;
                    int down = (n*2)-row;
                    int left = col;
                    int right = (n*2)-col;
                    int minimum = min(min(top,down),min(left,right));
                    System.out.print(" "+(n-minimum+1)+" ");
                }
                System.out.println();
            }
        }
                public static int min(int top, int down) {
                   if(top <= down){
                    return top;
                   }
                   return down;
                }


}
