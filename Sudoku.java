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

    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < this.grid.length; i++) {
            for (int j = 0; j < this.grid[0].length; j++) {
                if (j % 3 == 0 && j != 0) {
                    ret += "| ";
                }
                if (i % 3 == 0 && i != 0 && j == 0) {
                    ret += "---------------------\n";
                }
                ret += this.grid[i][j] + " ";
            }
            ret += "\n";
        }
        return ret;
    }
}