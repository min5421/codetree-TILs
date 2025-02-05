#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    scanf("%d", &n);
    int sum=0;
    for(int i=1; i<=n; i++){
        if(n%i==0&&n!=i){
            sum+=i;
        }
    }
    if(sum==n){
        printf("P");
    }
    else{
        printf("N");
    }
    return 0;
}