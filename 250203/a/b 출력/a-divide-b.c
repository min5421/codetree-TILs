#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b;
    scanf("%d %d", &a, &b);
    int c, d;
    c=a/b;
    d=a%b;
    printf("%d.", c);

    for(int i = 0; i < 20; i++){
        a=d*10;
        c=a/b;
        d=a%b;
        printf("%d",c);
    }

    return 0;
}