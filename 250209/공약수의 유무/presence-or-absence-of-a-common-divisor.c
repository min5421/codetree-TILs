#include <stdio.h>
#include <stdbool.h>

int main() {
    // Please write your code here.
    int a, b;
    scanf("%d %d", &a, &b);
    bool s=false;
    for(int i=a; i<=b; i++){
        if(1920%i==0&&2880%i==0){
            s=true;
        }
    }
    if(s){
        printf("1");
    }
    else{
        printf("0");
    }
    return 0;
}