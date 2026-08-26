class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {

                    if (map.containsKey(board[i][j])) {
                        return false;
                    }

                    map.put(board[i][j], 1);
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {

                    if (map.containsKey(board[j][i])) {
                        return false;
                    }

                    map.put(board[j][i], 1);
                }
            }
        }
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                HashMap<Character, Integer> map = new HashMap<>();

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                        if (board[i][j] != '.') {

                            if (map.containsKey(board[i][j])) {
                                return false;
                            }

                            map.put(board[i][j], 1);
                        }
                    }
                }
            }
        }

        return true;
    }
}