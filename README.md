# sudoku-solver
## Design Documentation
2 classes.
Sudoku, for the state of the board.
Solver, for the backtracking implementation.

### Sudoku
private fields
- grid 9x9 2d array

Constructor
- Takes in a 9x9 2d array

isValid
- Takes in a row index and col index
- Checks whether a cell is valid. Returns true if valid, false otherwise
- Check row for duplicate, check col for duplicate, check region for duplicate. (Use a HashSet to check for duplicates)

toString
- Override toString to print out the Sudoku class

### Solver
Use Back tracktracking
- For each cell, put 1 through 9. If none of them work, go back.
- Probably recursion
- For 

## Unanswered Questions
- isValid could be a private methods. We just need to call it each time we call setCell