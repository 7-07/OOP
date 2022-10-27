package ex1;

public class Exercise3 {

    public int row;
    public int column;
    public double maxValue;

    public Exercise3(int r, int c, double mv) {
        row = r;
        column = c;
        maxValue = mv;
    }

    public static Exercise3 findLargest(double[][] a) {

        int row = 0;
        int column = 0;
        double maxValue = a[row][column];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (maxValue < a[i][j]) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        return new Exercise3(row,column,maxValue);
    }


}