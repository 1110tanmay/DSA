package Matrix;

public class TthroughTwoDArr {
    public static void main(String[] args) {
        int TwoDarray[][] = {{3,1,14,5}, {17,12,18,21}};
        for (int i = 0;i<TwoDarray.length;i++){
            for (int j=0;j<TwoDarray[i].length;j++){
                System.out.print(TwoDarray[i][j]);
            }
            System.out.println("");
        }
    }
}
