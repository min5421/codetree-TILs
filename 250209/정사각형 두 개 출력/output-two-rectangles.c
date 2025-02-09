#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    scanf("%d", &n);
    for(int i=1; i<=2; i++){
        for(int j=1; j<=n; j++){
            for(int k=1; k<=n; k++){
                printf("*");
            }
            printf("\n");
        }
        printf("\n");
    }
    return 0;
}