#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b;
    scanf("%d %d", &a, &b);
    int sum=0;
    double cnt=0;
    for(int i=a; i<=b; i++){
        if(i%5==0||i%7==0){
            sum+=i;
            cnt++;
        }
    }
    printf("%d %.1lf", sum, sum/cnt);
    return 0;
}