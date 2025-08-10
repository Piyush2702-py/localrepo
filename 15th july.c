#include <stdio.h>
#include <stdlib.h>


// Insert element at a specific position
void insertElement(int **arr, int *n, int element, int position) {
    if (position < 0 || position > *n) {
        printf("Invalid position!\n");
        return;
    }

    *arr = (int *)realloc(*arr, (*n + 1) * sizeof(int));
    for (int i = *n; i > position; i--) {
        (*arr)[i] = (*arr)[i - 1];
    }
    (*arr)[position] = element;
    (*n)++;
}

// Delete element from a specific position
void deleteElement(int *arr, int *n, int position) {
    if (position < 0 || position >= *n) {
        printf("Invalid position!\n");
        return;
    }

    for (int i = position; i < *n - 1; i++) {
        arr[i] = arr[i + 1];
    }
    (*n)--;
    printf("Element deleted\n");
}

// Linear search
void linearSearch(int *arr, int n, int key) {
    for (int i = 0; i < n; i++) {
        if (arr[i] == key) {
            printf("Element found at position %d\n", i);
            return;
        }
    }
    printf("Element not found\n");
}

// Traverse array
void traverseArray(int *arr, int n) {
    printf("Array Elements: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}


int main() {
    int n, *arr, i, opt, element, position, key;

    printf("Enter size n : ");
    scanf("%d", &n);

    arr = (int *)malloc(n * sizeof(int));

    printf("Enter Array elements: ");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    while (1) {
        printf("\n***MENU***\n");
        printf("1. Insert\n");
        printf("2. Delete\n");
        printf("3. Linear Search\n");
        printf("4. Traverse\n");
        printf("5. Exit\n");
        printf("Enter option: ");
        scanf("%d", &opt);

        switch (opt) {
            case 1:
                printf("Element to insert: ");
                scanf("%d", &element);
                printf("Enter Position: ");
                scanf("%d", &position);
                insertElement(&arr, &n, element, position);
                printf("Element inserted\n");
                break;

            case 2:
                printf("Enter position to delete: ");
                scanf("%d", &position);
                deleteElement(arr, &n, position);
                break;

            case 3:
                printf("Enter the element to search: ");
                scanf("%d", &key);
                linearSearch(arr, n, key);
                break;

            case 4:
                traverseArray(arr, n);
                break;

            case 5:
                free(arr);
                return 0;

            default:
                printf("Invalid option!\n");
        }
    }
}

