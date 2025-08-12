#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
};

int main() {
    struct Node *head = NULL, *temp, *newNode;
    int n, data, pos, choice, i,key;

    printf("Enter number of nodes: ");
    scanf("%d", &n);

    if (n > 0) {
        printf("Enter the elements: ");
        for (i = 1; i <= n; i++) {
            newNode = (struct Node *)malloc(sizeof(struct Node));
            scanf("%d", &newNode->data);
            newNode->next = NULL;

            if (head == NULL) {
                head = newNode;
            } else {
                temp = head;
                while (temp->next != NULL) {
                    temp = temp->next;
                }
                temp->next = newNode;
            }
        }
    }

    printf("MENU:\n");
    printf("1. Insert the node at a position\n");
    printf("2. Delete a node from specific position\n");
    printf("3. Count\n");
    printf("4. Traversal\n");
    printf("5. Search an element\n");
    printf("6. Sort the list in ascending order\n");
    printf("7. Reverse the list");
    printf("8. Exit\n");


    do {
        printf("Enter choice: ");
        scanf("%d", &choice);

        if (choice == 1) {
            printf("Enter element: ");
            scanf("%d", &data);
            printf("Enter position: ");
            scanf("%d", &pos);

            newNode = (struct Node *)malloc(sizeof(struct Node));
            newNode->data = data;
            newNode->next = NULL;

            if (pos <= 1 || head == NULL) {
                newNode->next = head;
                head = newNode;
            } else {
                temp = head;
                for (i = 1; i < pos - 1 && temp->next != NULL; i++) {
                    temp = temp->next;
                }
                newNode->next = temp->next;
                temp->next = newNode;
            }
            printf("Node inserted\n");
        }

        else if (choice == 2) {
            printf("Enter position: ");
            scanf("%d", &pos);

            if (head == NULL) {
                printf("List is empty!\n");
            } else if (pos <= 1) {
                temp = head;
                head = head->next;
                free(temp);
                printf("Node deleted\n");
            } else {
                struct Node *prev = NULL;
                temp = head;
                for (i = 1; i < pos && temp != NULL; i++) {
                    prev = temp;
                    temp = temp->next;
                }
                if (temp == NULL) {
                    printf("Position out of range!\n");
                } else {
                    prev->next = temp->next;
                    free(temp);
                    printf("Node deleted\n");
                }
            }
        }

        else if (choice == 3) {
            int count = 0;
            temp = head;
            while (temp != NULL) {
                count++;
                temp = temp->next;
            }
            printf("The total number of nodes: %d\n", count);
        }

        else if (choice == 4) {
            if (head == NULL) {
                printf("List is empty!\n");
            } else {
                printf("The list is: ");
                temp = head;
                while (temp != NULL) {
                    printf("%d", temp->data);
                    if (temp->next != NULL) printf("-> ");
                    temp = temp->next;
                }
                printf("\n");
            }
        }

        else if(choice==5){
            printf("Enter the element to search:");
            scanf("%d",&key);
            for(i=1;i<n;i++){
                if(data==key){
                    printf("Element found at position %d",i);
                }
                else{
                    printf("No element found");
                }
            }
        }

        else if (choice == 6) {
            printf("Exiting...\n");
        }

        else {
            printf("Invalid choice!\n");
        }

    } while (choice != 5);

    return 0;
}
