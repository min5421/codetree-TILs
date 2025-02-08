#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b;
    char c;
    while(1){
        scanf("%d %d %c", &a, &b, &c);
        printf("%d\n", a*b);
        if(c=='C'){
            break;
        }
    }
    return 0;
}