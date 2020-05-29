
public class Solver {
    
    public static void main(String[] args) {
        int[][] gridHard = {{3, 5, 0, 0, 0, 0, 0, 8, 0}, 
                            {0, 0, 0, 0, 5, 8, 9, 0, 2},
                            {0, 0, 0, 0, 0, 7, 0, 0, 0},
                            {0, 1, 0, 0, 0, 5, 0, 4, 0},
                            {0, 0, 0, 7, 0, 0, 0, 9, 0},
                            {0, 0, 9, 0, 1, 2, 0, 0, 7},
                            {0, 0, 0, 0, 0, 0, 0, 0, 3},
                            {6, 0, 0, 2, 0, 0, 0, 0, 0},
                            {0, 0, 2, 3, 0, 0, 1, 0, 8}};

        int[][] gridEasy = {{2, 0, 1, 0, 0, 0, 0, 8, 0}, 
                            {9, 7, 0, 0, 8, 0, 0, 1, 0},
                            {0, 0, 6, 0, 2, 0, 3, 0, 9},
                            {3, 6, 4, 9, 1, 0, 5, 2, 0},
                            {5, 8, 0, 2, 4, 0, 1, 9, 6},
                            {0, 9, 0, 7, 0, 0, 8, 0, 4},
                            {0, 0, 0, 8, 7, 2, 9, 6, 3},
                            {0, 0, 0, 1, 3, 0, 0, 5, 0},
                            {7, 0, 0, 5, 6, 0, 2, 4, 1}};
        Sudoku puzzle = new Sudoku(gridHard);
        System.out.println("Initial:");
        System.out.println(puzzle.toString());
        solve(puzzle);
        System.out.println("Solution:");
        System.out.println(puzzle);
    }

    public static void solve(Sudoku puzzle) {
        solveHelper(0, 0, puzzle);
    }

    public static boolean solveHelper(int row, int col, Sudoku puzzle) {
        if (row > 8 || col > 8) {
            return true;
        }
        
        int nextCol = col + 1;
        int nextRow = row;
        if (nextCol == 9) {
            nextCol = 0;
            nextRow++;
        }
        if (puzzle.isAClue(row, col)) {
            return solveHelper(nextRow, nextCol, puzzle);
        } else {
            // For debugging
            //System.out.println("(" + row + ", " + col + ")");
            //System.out.println(puzzle);
            for (int i = 1; i <= 9; i++) {
                if (puzzle.isValid(row, col, i)) {
                    puzzle.setCell(row, col, i);
                    if (solveHelper(nextRow, nextCol, puzzle)) {
                        return true;
                    }
                    puzzle.clearCell(row, col);
                }
            }
        }
        return false;
    }
}