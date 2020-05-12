import java.util.Arrays;

public class Solver {
    
    public static void main(String[] args) {
        int[][] grid = {{3, 5, 0, 0, 0, 0, 0, 8, 0}, 
                        {0, 0, 0, 0, 5, 8, 9, 0, 2},
                        {0, 0, 0, 0, 0, 7, 0, 0, 0},
                        {0, 1, 0, 0, 0, 5, 0, 4, 0},
                        {0, 0, 0, 7, 0, 0, 0, 9, 0},
                        {0, 0, 9, 0, 1, 2, 0, 0, 7},
                        {0, 0, 0, 0, 0, 0, 0, 0, 3},
                        {6, 0, 0, 2, 0, 0, 0, 0, 0},
                        {0, 0, 2, 3, 0, 0, 1, 0, 8}};
        //System.out.println(Arrays.deepToString(grid));
        Sudoku puzzle = new Sudoku(grid);
        System.out.println(puzzle.toString());
        System.out.println(puzzle.isValid(0, 0, 3));
    }
}