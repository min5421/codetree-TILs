#include <stdio.h>
#include <stdbool.h>

int main() {
    // Please write your code here.
    bool s=true;
    int n;
    scanf("%d", &n);
    for(int i=2; i<n; i++){
        if(n%i==0){
            s=false;
        }
    }
    if(s){
        printf("P");
    }
    else{
        printf("C");
    }
    return 0;
}