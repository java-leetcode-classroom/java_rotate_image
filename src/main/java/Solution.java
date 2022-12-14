public class Solution {
  public void rotate(int[][] matrix) {
    int n = matrix.length;
    int small = n/2;
    int large = (n%2 == 0) ? small:small+1;
    for (int i = 0; i < large; i++) {
      for (int j = 0; j < small;j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[n-1-j][i];
        matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
        matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
        matrix[j][n-1-i] = temp;
      }
    }
  }
}
