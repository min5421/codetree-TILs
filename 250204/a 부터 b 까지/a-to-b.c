#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b;
    scanf("%d %d", &a, &b);
    for(int i=a; i<=b; i+=0){
        printf("%d ", i);
        if(i%2==1){
            i*=2;
        }
        else{
            i+=3;
        }     
    }
    return 0;
}