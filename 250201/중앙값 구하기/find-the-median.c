#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    if(a>b&&a>c){
        if(b>c){
            printf("%d", b);
        }
        else{
            printf("%d", c);
        }
    }
    else if(b>a&&b>c){
        if(a>c){
            printf("%d", a);
        }
        else{
            printf("%d", c);
        }
    }
    else{
        if(a>b){
            printf("%d", a);
        }
        else{
            printf("%d", b);
        }
    }
    return 0;
}