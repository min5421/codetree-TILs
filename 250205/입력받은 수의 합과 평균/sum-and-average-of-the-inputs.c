#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    scanf("%d", &n);
    int sum=0;
    double cnt=0;
    for(int i=1; i<=n; i++){
        int a;
        scanf("%d", &a);
        sum+=a;
        cnt++;
    }
    printf("%d %.1lf", sum, sum/cnt);
    return 0;
}