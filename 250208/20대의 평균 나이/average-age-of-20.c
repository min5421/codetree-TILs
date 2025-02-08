#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    double sum=0;
    double cnt=0;
    while(1){
        scanf("%d", &n);
        if(n<20||n>=30){
            break;}
        sum+=n;
        cnt++;
    }
    printf("%.2lf", sum/cnt);
    return 0;
}