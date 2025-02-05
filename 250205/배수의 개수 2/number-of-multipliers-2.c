#include <stdio.h>

int main() {
    // Please write your code here.
    int cnt=0;
    for(int i=1; i<=10; i++){
        int a;
        scanf("%d", &a);
        if(a%2==1){
            cnt++;
        }
    }
    printf("%d", cnt);
    return 0;
}