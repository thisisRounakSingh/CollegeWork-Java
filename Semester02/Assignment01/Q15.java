package Semester02.Assignment01;

public class Q15 {
  // Assigned on 02/02/2026
  public static void main(String[] args) {
    int[][] randomMatrix = new int[4][4];
    for (int i = 0; i < randomMatrix.length; i++) {
      for (int j = 0; j < randomMatrix.length; j++) {
        randomMatrix[i][j] = (int) (Math.random() * 2);
      }
    }

    System.out.println("Printing the generated matrix.");
    for (int i = 0; i < randomMatrix.length; i++) {
      for (int j = 0; j < randomMatrix.length; j++) {
        System.out.printf("%d ", randomMatrix[i][j]);
      }
      System.out.println();
    }

    int previousCountOfOne = 0, currentCountOfOne = 0, largestRowIndex = 0;
    for (int i = 0; i < randomMatrix.length; i++) {
      for (int j = 0; j < randomMatrix.length; j++) {
        if (randomMatrix[i][j] == 1) {
          currentCountOfOne++;
        }
      }
      if (previousCountOfOne < currentCountOfOne) {
        previousCountOfOne = currentCountOfOne;
        largestRowIndex = i;
      }
      currentCountOfOne = 0;
    }
    System.out.printf("The largest row index: %d (0-based)%n", largestRowIndex);

    int beforeCountOfOne = 0, nowCountOfOne = 0, largestColumnIndex = 0;
    for (int i = 0; i < randomMatrix.length; i++) {
      for (int j = 0; j < randomMatrix.length; j++) {
        if (randomMatrix[j][i] == 1) {
          nowCountOfOne++;
        }
      }

      if (beforeCountOfOne < nowCountOfOne) {
        beforeCountOfOne = nowCountOfOne;
        largestColumnIndex = i;
      }
      nowCountOfOne = 0;
    }
    System.out.printf("The largest column index: %d (0-based)%n", largestColumnIndex);
  }
}
