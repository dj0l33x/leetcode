package valid_sudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        final List<HashSet<Character>> lines = init();
        final List<HashSet<Character>> columns = init();
        final List<HashSet<Character>> cubes = init();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                if (!lines.get(i).add(c) || !columns.get(j).add(c) || !cubes.get(getCubeNumber(i, j)).add(c)) {
                    return false;
                }
            }
        }
        return true;
    }

    private int getCubeNumber(final int i, final int j) {
        return (i / 3) *3 + j / 3;
    }

    private List<HashSet<Character>> init() {
        List<HashSet<Character>> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(i, new HashSet<>());
        }
        return list;
    }
}
