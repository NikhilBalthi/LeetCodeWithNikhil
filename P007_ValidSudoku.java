/**
 * Problem 7: Valid Sudoku
 * Link: https://leetcode.com/problems/valid-sudoku/
 * 
 * Explanation:
 * Use 3 hash sets per row, column, and box to track seen digits.
 *
 * Time Complexity: O(1) (since board is 9x9)
 * Space Complexity: O(1)
 */
import java.util.*;

public class P007_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (!seen.add(c + " in row " + i) ||
                        !seen.add(c + " in col " + j) ||
                        !seen.add(c + " in box " + i/3 + "-" + j/3)) return false;
                }
            }
        }
        return true;
    }
}
