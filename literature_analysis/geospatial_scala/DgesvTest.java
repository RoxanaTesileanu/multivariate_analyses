/* 
Recieved from K. Seymour per mail on 09.11.2017
*/


import org.netlib.util.*;
import org.netlib.lapack.Dgesv;

public class DgesvTest {

  public static void main(String[] args) {
    int N = 4;
    int NRHS = 1;
    double[]A = {1.80, 5.25, 1.58, -1.11,
                 2.88, -2.95, -2.69, -0.66,
                 2.05, -0.95, -2.90, -0.59,
                 -0.89, -3.80, -1.04, 0.80};
    double[]B = {9.52, 24.35, 0.77, -6.22};
    int LDA = N;
    int LDB = N;

    int[]IPIV = new int[N];
    org.netlib.util.intW info = new org.netlib.util.intW(2);

    Dgesv.dgesv(N, NRHS, A, 0, LDA, IPIV, 0, B, 0, LDB, info);

    System.out.println("info = " + info.val);

    if(info.val == 0) {
      for(int i=0;i<N;i++) {
        System.out.print(B[i] + " ");
      }
      System.out.println();
      System.out.println();

      for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
          System.out.print(A[j*LDA+i] + " ");
        }
        System.out.println();
      }
    }
  }
}
