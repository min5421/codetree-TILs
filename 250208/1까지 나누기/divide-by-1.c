#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    scanf("%d", &n);
    int cnt=0;
    int m = n;
    for(int i=1; i<=n; i++){
        m = m /i;
        cnt++;
        if(m<=1){
            break;
        }
    }
    printf("%d", cnt);
    return 0;
}