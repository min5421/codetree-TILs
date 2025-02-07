#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    scanf("%d", &n);
    int sum=0;
    for(int i=1; i<=100; i++){
        sum+=i;
        if(sum>=n){
            printf("%d", i);
            break;
        }
    }
    return 0;
}