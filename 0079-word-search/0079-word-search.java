class Solution {
    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int k) {

        // All characters have been found
        if (k == word.length()) {
            return true;
        }

        // Out of bounds
        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length) {
            return false;
        }

        // Current cell doesn't match
        if (board[i][j] != word.charAt(k)) {
            return false;
        }

        // Mark current cell as visited
        char temp = board[i][j];
        board[i][j] = '#';

        // Explore all 4 directions
        boolean found =
            dfs(board, word, i + 1, j, k + 1) ||  // down
            dfs(board, word, i - 1, j, k + 1) ||  // up
            dfs(board, word, i, j + 1, k + 1) ||  // right
            dfs(board, word, i, j - 1, k + 1);    // left

        // Backtrack: restore the cell
        board[i][j] = temp;

        return found;
    }
}