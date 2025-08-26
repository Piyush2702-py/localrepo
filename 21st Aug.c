#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *prev, *next;
};

struct Node *head = NULL;

// Function to create a new node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->prev = newNode->next = NULL;
    return newNode;
}

// Function to create the initial list
void createList(int n) {
    struct Node *temp, *newNode;
    int data;

    if (n <= 0) return;

    printf("Enter the elements: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &data);
        newNode = createNode(data);

        if (head == NULL) {
            head = newNode;
            temp = head;
        } else {
            temp->next = newNode;
            newNode->prev = temp;
            temp = temp->next;
        }
    }
}

// Insert at specific position
void insertAtPosition(int data, int pos) {
    struct Node *newNode = createNode(data);

    if (pos == 1) { // insert at head
        newNode->next = head;
        if (head != NULL)
            head->prev = newNode;
        head = newNode;
        printf("Node inserted\n");
        return;
    }

    struct Node *temp = head;
    for (int i = 1; temp != NULL && i < pos - 1; i++)
        temp = temp->next;

    if (temp == NULL) {
        printf("Position out of range!\n");
        free(newNode);
        return;
    }

    newNode->next = temp->next;
    newNode->prev = temp;

    if (temp->next != NULL)
        temp->next->prev = newNode;
    temp->next = newNode;

    printf("Node inserted\n");
}

// Delete at specific position
void deleteAtPosition(int pos) {
    if (head == NULL) {
        printf("List is empty!\n");
        return;
    }

    struct Node *temp = head;

    if (pos == 1) {
        head = temp->next;
        if (head != NULL)
            head->prev = NULL;
        free(temp);
        printf("Node deleted\n");
        return;
    }

    for (int i = 1; temp != NULL && i < pos; i++)
        temp = temp->next;

    if (temp == NULL) {
        printf("Position out of range!\n");
        return;
    }

    if (temp->next != NULL)
        temp->next->prev = temp->prev;
    if (temp->prev != NULL)
        temp->prev->next = temp->next;

    free(temp);
    printf("Node deleted\n");
}

// Traverse
void traverse() {
    struct Node *temp = head;
    if (temp == NULL) {
        printf("List is empty!\n");
        return;
    }

    printf("The list is: ");
    while (temp != NULL) {
        printf("%d", temp->data);
        if (temp->next != NULL) printf("->");
        temp = temp->next;
    }
    printf("\n");
}

// Main
int main() {
    int n, choice, data, pos;

    printf("Enter number of nodes: ");
    scanf("%d", &n);

    createList(n);

    while (1) {
        printf("MENU:\n");
        printf("1. Insert the node at a position\n");
        printf("2. Delete a node from specific position\n");
        printf("3. Traversal\n");
        printf("5. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
        case 1:
            printf("Enter element: ");
            scanf("%d", &data);
            printf("Enter position: ");
            scanf("%d", &pos);
            insertAtPosition(data, pos);
            break;

        case 2:
            printf("Enter position: ");
            scanf("%d", &pos);
            deleteAtPosition(pos);
            break;

        case 3:
            traverse();
            break;

        case 5:
            exit(0);

        default:
            printf("Invalid choice!\n");
        }
    }
    return 0;
}

