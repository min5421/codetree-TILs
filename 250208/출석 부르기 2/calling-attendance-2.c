#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    while(1){
        scanf("%d", &n);
        if(n==1){
            printf("John\n");
        }
        else if(n==2){
            printf("Tom\n");
        }
        else if(n==3){
            printf("Paul\n");
        }
        else if(n==4){
            printf("Sam\n");
        }
        else{
            break;
        }
    }
    printf("Vacancy\n");
    return 0;
}