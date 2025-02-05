#include <stdio.h>

int main() {
    // Please write your code here.
    int cnt=0;
    for(int i=1; i<=5; i++){
        int a;
        scanf("%d", &a);
        if(a%2==0){
            cnt++;
        }
    }
    printf("%d", cnt);
    return 0;
}