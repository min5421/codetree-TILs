#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    scanf("%d", &n);
    int cnt=0;
    for(int i=1; i<=n; i++){
        if(i%100==0&&i%400!=0){
            cnt+=0;
        }
        else if(i%4==0){
            cnt++;
        }
    }
    printf("%d", cnt);
    return 0;
}