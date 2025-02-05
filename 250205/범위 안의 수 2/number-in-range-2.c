#include <stdio.h>

int main() {
    // Please write your code here.
    int sum=0;
    double cnt=0;
    for(int i=1; i<=10; i++){
        int a;
        scanf("%d", &a);
        if(a>=0&&a<=200){
            sum+=a;
            cnt++;
        }
    }
    printf("%d %.1lf", sum, sum/cnt);
    return 0;
}