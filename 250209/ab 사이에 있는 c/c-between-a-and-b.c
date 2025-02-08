#include <stdio.h>
#include <stdbool.h>

int main() {
    // Please write your code here.
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    bool s=false;
    for(int i=a; i<=b; i++){
        if(i%c==0){
            s=true;
        }
    }
    if(s==true){
        printf("YES");
    }
    else{
        printf("NO");
    }
    return 0;
}