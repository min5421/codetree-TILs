#include <stdio.h>

int main() {
    // Please write your code here.
    int cnt1=0;
    int cnt2=0;
    for(int i=1; i<=10; i++){
        int a;
        scanf("%d", &a);
        if(a%3==0){
            cnt1++;
        }
        if(a%5==0){
            cnt2++;
        }
    }
    printf("%d %d", cnt1, cnt2);
    return 0;
}