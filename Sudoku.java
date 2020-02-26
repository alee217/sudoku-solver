public class Sudoku {
    private int[][] grid;

    public Sudoku(int[][] grid) {
        this.grid = deepCopy(grid);
    }

    private int[][] deepCopy(int[][] src) {
        int[][] dst = new int[9][9];
        for (int i = 0; i < src.length; i++) {
            for (int j = 0; j < src[0].length; j++) {
                dst[i][j] = src[i][j];
            }
        }
        return dst;
    }
}