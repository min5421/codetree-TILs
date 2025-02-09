#include <stdio.h>
#include <stdbool.h>

int main() {
    // Please write your code here.
    bool s=true;
    for(int i=1; i<=5; i++){
        int a;
        scanf("%d", &a);
        if(a%3!=0){
            s=false;
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