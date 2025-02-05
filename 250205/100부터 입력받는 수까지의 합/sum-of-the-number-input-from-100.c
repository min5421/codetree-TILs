#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    scanf("%d", &n);
    int sum=0;
    for(int i=100; i>=n; i--){
        sum+=i;
    }
    printf("%d", sum);
    return 0;
}