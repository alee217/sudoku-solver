public class Sudoku {
    public static final int GRID_SIZE = 9;

    private int[][] grid;

    public Sudoku(int[][] grid) {
        this.grid = deepCopy(grid);
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

    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < GRID_SIZE; i++) {
            if (i != 0 && i % 3 == 0) {
                ret += "-----------------------\n";
            }
            ret += " ";
            for (int j = 0; j < GRID_SIZE; j++) {
                if (j != 0 && j % 3 == 0) {
                    ret += "| ";
                }
                ret += grid[i][j] + " ";
            }
            ret += "\n";
        }
        return ret;
    }
}