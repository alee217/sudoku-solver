public class Sudoku {
    public static final int GRID_SIZE = 9;

    private int[][] grid;
    private boolean[][] clueGrid; // True if the cell if a clue, false otherwise.

    public Sudoku(int[][] grid) {
        this.grid = deepCopy(grid);
        this.clueGrid = getCluesLocation(grid);
    }

    /**
     * Returns true if we've succesfully set the cell.
     * Returns false if we'll violate the rule with this set.
     */
    public boolean setCell(int row, int col, int newDigit) {
        if (isValid(row, col, newDigit)) {
            grid[row][col] = newDigit;
            return true;
        }
        return false;
    }

    // Returns whethers a cell is valid.
    public boolean isValid(int row, int col, int newDigit) {
        if (clueGrid[row][col]) {
            return false;
        }
        for (int i = 0; i < 9; i++) {
            if (row != i && newDigit == grid[i][col]) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (col != i && newDigit == grid[row][i]) {
                return false;
            }
        }
        int upperLeftBoxRow = (row / 3) * 3;
        int upperLeftBoxCol = (col / 3) * 3;
        for (int i = upperLeftBoxRow; i < upperLeftBoxRow + 3; i++) {
            for (int j = upperLeftBoxCol; j < upperLeftBoxCol + 3; j++) {
                if (row != i && col != j && newDigit == grid[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Checks whether the current board obeys the One Rule i.e. the rule of the game.
    public boolean isValid() {
        return false;
    }

    // Deep copies a grid.
    private int[][] deepCopy(int[][] src) {
        if (src == null || src.length != GRID_SIZE || src[0].length != GRID_SIZE) {
            throw new IllegalArgumentException();
        }
        int[][] dst = new int[GRID_SIZE][GRID_SIZE];
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                dst[i][j] = src[i][j];
            }
        }
        return dst;
    }

    private boolean[][] getCluesLocation(int[][] src) {
        boolean[][] res = new boolean[9][9];
        for (int i = 0; i < src.length; i++) {
            for (int j = 0; j < src[0].length; j++) {
                if (src[i][j] != 0) {
                    res[i][j] = true;
                }
            }
        }
        return res;
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