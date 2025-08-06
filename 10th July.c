#include<stdio.h>
int compare_numbers(int *num1,int *num2){
    if(*num1>*num2){
        printf("%d is greater than %d",*num1,*num2);
    }
    else if(*num1<*num2){
        printf("%d is smaller than %d",*num1,*num2);
    }
    else if(*num1==*num2){
        printf("Both the numbers are same");
    } 
}

int main()
{
int num1,num2;
printf("Enter two numbers:");
scanf("%d%d",&num1,&num2);
compare_numbers(&num1,&num2);
return 0;
}