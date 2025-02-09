#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    int a = 1;
    scanf("%d", &n);
    for(int i=1; i<=n; i++){
        for(int j=1; j<=a; j++){
            printf("*");
        }
        printf("\n");
        a += 2;
    }
    return 0;
}