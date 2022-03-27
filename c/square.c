#include <stdio.h>

int main()
{
    int myNum, myNum2;
    printf("Enter a number: ");
    scanf("%d", &myNum);
    for (int i = 1; i <= myNum; i++) {
        printf("* ");
    if(i == myNum) {
        printf("\n");
    }}
    myNum2 = myNum - 2;
    for (int i = 1; i <= myNum2; i++){
        printf("* ");
        for (int j = 1; j <= myNum2; j++){
            printf("  ");
        }
        printf("* \n");
    }
    for (int i = 1; i <= myNum; i++) {
        printf("* ");
    if(i == myNum) {
        printf("\n");
    }}    
}
