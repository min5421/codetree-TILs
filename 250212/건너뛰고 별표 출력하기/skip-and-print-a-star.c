#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    scanf("%d", &n);
    for(int i=1; i<n; i++){
        for(int j=1; j<=i; j++){
            printf("*");
        }
        printf("\n\n");
    }
    for(int i=n; i>0; i--){
        for(int j=0; j<i; j++){
            printf("*");
        }
        printf("\n\n");
    }
    return 0;
}