#include <stdio.h>
struct Employee {
    int emp_id;
    char name[50];
    char designation[50];
    float basic_salary;
    float hra_percent;
    float da_percent;
};
int main() {
    int n, i;
    float hra, da, gross_salary;
    printf("Enter the number of employees: ");
    scanf("%d", &n);
    struct Employee emp[n]; 
    for (i = 0; i < n; i++) {
        printf("\nEnter details of Employee %d:\n", i + 1);
        printf("Emp ID: ");
        scanf("%d", &emp[i].emp_id);
        printf("Name: ");
        scanf(" %[^\n]", emp[i].name); 
        printf("Designation: ");
        scanf(" %[^\n]", emp[i].designation);
        printf("Basic Salary: ");
        scanf("%f", &emp[i].basic_salary);
        printf("HRA %%: ");
        scanf("%f", &emp[i].hra_percent);
        printf("DA %%: ");
        scanf("%f", &emp[i].da_percent);
    }
    printf("\n--- Employee Details with Gross Salary ---\n");
    for (i = 0; i < n; i++) {
        hra = (emp[i].hra_percent / 100) * emp[i].basic_salary;
        da = (emp[i].da_percent / 100) * emp[i].basic_salary;
        gross_salary = emp[i].basic_salary + hra + da;
        printf("\nEmployee %d:\n", i + 1);
        printf("Emp ID: %d\n", emp[i].emp_id);
        printf("Name: %s\n", emp[i].name);
        printf("Designation: %s\n", emp[i].designation);
        printf("Basic Salary: %.2f\n", emp[i].basic_salary);
        printf("HRA (%.2f%%): %.2f\n", emp[i].hra_percent, hra);
        printf("DA (%.2f%%): %.2f\n", emp[i].da_percent, da);
        printf("Gross Salary: %.2f\n", gross_salary);
    }

    return 0;
}