#include <stdio.h>

int main() {
    // Please write your code here.
    int cnt=0;
    int n;
    int a;
    scanf("%d", &n);
    a=n;
    while(1){
        a=a/2;
        if(a>1){
            cnt++;
        }
        if(a==1){
            cnt++;
            break;
        }
    }
    printf("%d", cnt);
    return 0;
}