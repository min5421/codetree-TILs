#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b;
    scanf("%d %d", &a, &b);
    int i=a;
    while(i<=b){
        printf("%d ", i);
        i+=2;
    }
    return 0;
}