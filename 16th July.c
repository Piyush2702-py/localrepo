#include <stdio.h>

#define MAX 100

// Count non-zero elements
int countNonZero(int arr[MAX][MAX], int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (arr[i][j] != 0) {
                count++;
            }
        }
    }
    return count;
}

// Display upper triangular matrix (excluding main diagonal)
void displayUpperTriangular(int arr[MAX][MAX], int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j > i) {
                printf("%d ", arr[i][j]);
            } else {
                printf("  "); // spaces for alignment
            }
        }
        printf("\n");
    }
}


// Display elements just above and below main diagonal
void displayAboveBelowDiagonal(int arr[MAX][MAX], int n) {
    printf("Above diagonal: ");
    for (int i = 0; i < n - 1; i++) {
        printf("%d ", arr[i][i + 1]);
    }
    printf("\nBelow diagonal: ");
    for (int i = 1; i < n; i++) {
        printf("%d ", arr[i][i - 1]);
    }
    printf("\n");
}


int main() {
    int n, arr[MAX][MAX], i, j;

    printf("Enter size of the square matrix: ");
    scanf("%d", &n);

    printf("Enter elements of the matrix:\n");
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            scanf("%d", &arr[i][j]);
        }
    }

    printf("\nNonzero elements : %d\n", countNonZero(arr, n));

    printf("Upper triangular matrix:\n");
    displayUpperTriangular(arr, n);

    printf("Elements just above and below main diagonal:\n");
    displayAboveBelowDiagonal(arr, n);

    return 0;
}






