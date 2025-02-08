#include <stdio.h>
#include <stdbool.h>

int main() {
    // Please write your code here.
    int n;
    scanf("%d", &n);
    bool s=false;
    for(int i=2; i<=(n-1); i++){
        if(n%i==0){
            s=true;
        }
    }
    if(s){
        printf("C");
    }
    else{
        printf("N");
    }
    return 0;
}