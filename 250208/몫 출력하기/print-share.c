#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    int cnt=0;
    while(1){
        scanf("%d", &n);
        if(n%2==0){
            cnt++;
            printf("%d\n", n/2);
        }
        if(cnt==3){
            break;
        }
    }
    return 0;
}