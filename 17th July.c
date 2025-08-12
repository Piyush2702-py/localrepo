#include <stdio.h>

int main() {
    int rows, cols;
    int mat[50][50];
    int tuple[100][3]; // First row: metadata, rest: non-zero elements
    int i, j, k = 1, nonZero = 0;

    printf("Enter size of the sparse matrix: ");
    scanf("%d %d", &rows, &cols);

    printf("Enter elements of sparse matrix:\n");
    for (i = 0; i < rows; i++) {
        for (j = 0; j < cols; j++) {
            scanf("%d", &mat[i][j]);
            if (mat[i][j] != 0) {
                nonZero++;
                tuple[k][0] = i;         // row index
                tuple[k][1] = j;         // column index
                tuple[k][2] = mat[i][j]; // value
                k++;
            }
        }
    }

    // First row of tuple: matrix dimensions + non-zero count
    tuple[0][0] = rows;
    tuple[0][1] = cols;
    tuple[0][2] = nonZero;

    printf("\nSparse matrix in 3-tuple format:\n");
    for (i = 0; i <= nonZero; i++) {
        printf("%d\t%d\t%d\n", tuple[i][0], tuple[i][1], tuple[i][2]);
    }

    return 0;
}
