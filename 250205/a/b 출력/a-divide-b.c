#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b;
    scanf("%d %d", &a, &b);
    printf("%d.", a/b); 
    for(int i=1; i<21; i++){
        a%=b;
        a*=10;
        printf("%d", a/b);
    }
    return 0;
}