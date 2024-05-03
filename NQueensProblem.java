import java.util.*;

public class NQueensProblem {
    private int[] queens;
    private int numSolutions;

    public NQueensProblem(int boardSize) {
        queens = new int[boardSize];
    }

    public void solve() {
        solve(0);
    }
    
    private void solve(int row) {
        if (row == queens.length) {
            numSolutions++;
            printSolution();
        } else {
            for (int col = 0; col < queens.length; col++) {
                queens[row] = col;
                if (isValidPosition(row, col)) {
                    solve(row + 1);
                }
            }
        }
    }

    private boolean isValidPosition(int row, int col) {
        for (int i = 0; i < row; i++) {
            int diff = Math.abs(queens[i] - col);
            if (diff == 0 || diff == row - i) {
                return false;
            }
        }
        return true;
    }

    private void printSolution() {
        if (numSolutions == 1) {
            System.out.print("Solution: ");
            for (int i = 0; i < queens.length; i++) {
                System.out.print(queens[i] + " ");
            }
            System.out.println("\nThe Matrix Representation:");
            int[][] board = new int[queens.length][queens.length];
            for (int i = 0; i < queens.length; i++) {
                for (int j = 0; j < queens.length; j++) {
                    board[i][j] = (j == queens[i]) ? 1 : 0;
                }
            }
            for (int i = 0; i < queens.length; i++) {
                for (int j = 0; j < queens.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N Queens Problem: ");
        int n = scanner.nextInt();
        NQueensProblem nQueensProblem = new NQueensProblem(n);
        nQueensProblem.solve();
        scanner.close();
    }
}
