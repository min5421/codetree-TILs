#include <stdio.h>

int main() {
    // Please write your code here.
    char c;
    int n;
    scanf("%c %d", &c, &n);
    if(c=='A'){
        for(int i=1; i<=n; i++){
            printf("%d ", i);
        }
    }
    else if(c=='D'){
        for(int k=n; k>=1; k--){
            printf("%d ", k);
        }
    }
    return 0;
}