public class Solver {
    public static void main(String[] args) {
        int[][] grid = {
            {3, 5, 0, 0, 0, 0, 0, 8, 0},
            {0, 0, 0, 0, 5, 8, 9, 0, 2},
            {0, 0, 0, 0, 0, 7, 0, 0, 0},
            {0, 1, 0, 0, 0, 5, 0, 4, 0},
            {0, 0, 0, 7, 0, 0, 0, 9, 0},
            {0, 0, 9, 0, 1, 2, 0, 0, 7},
            {0, 0, 0, 0, 0, 0, 0, 0, 3},
            {6, 0, 0, 2, 0, 0, 0, 0, 0},
            {0, 0, 2, 3, 0, 0, 1, 0, 8},
        };
        Sudoku s = new Sudoku(grid);
        System.out.println(s.toString());
    }
}