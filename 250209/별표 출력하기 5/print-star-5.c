#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    scanf("%d", &n);
    for(int i=n; i>=1; i--){
        for(int j=i; j>=1; j--){
            for(int k=i; k>=1; k--){
                printf("*");
            }
            printf(" ");
        }
        printf("\n");
    }
    return 0;
}