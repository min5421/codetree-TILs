#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b;
    scanf("%d %d", &a, &b);
    int prod=1;
    for(int i=a; i<=b; i++){
        prod*=i;
    }
    printf("%d", prod);
    return 0;
}