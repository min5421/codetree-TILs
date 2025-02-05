#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b;
    scanf("%d %d", &a, &b);
    int sum=0;
    if(a>b){
        for(int i=b; i<=a; i++){
            if(i%5==0){
                sum+=i;
            }
        }
    }
    else{
        for(int i=a; i<=b; i++){
            if(i%5==0){
                sum+=i;
            }
        }
    }
    printf("%d", sum);
    return 0;
}