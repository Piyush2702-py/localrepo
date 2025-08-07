#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int Prime(int num) {
    if (num <= 1)
        return 0;
    for (int i = 2; i <= sqrt(num); i++) {
        if (num % i == 0)
            return 0;
    }
    return 1;
} 
int sumOfPrimes(int *arr, int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        if (Prime(arr[i])) {
            sum += arr[i];
        }
    }
    return sum;
}
int main() {
    int n, *arr;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    arr = (int *)malloc(n * sizeof(int));
    printf("Enter %d integers:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int primeSum = sumOfPrimes(arr, n);
    printf("Sum of prime numbers in the array: %d\n", primeSum);
    free(arr);
    return 0;
}