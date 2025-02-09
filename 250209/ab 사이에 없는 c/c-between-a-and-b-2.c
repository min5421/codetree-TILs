#include <stdio.h>
#include <stdbool.h>

int main() {
    // Please write your code here.
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    bool s=true;
    for(int i=a; i<=b; i++){
        if(i%c==0){
            s=false;
        }
    }
    if(s){
        printf("YES");
    }
    else{
        printf("NO");
    }
    return 0;
}