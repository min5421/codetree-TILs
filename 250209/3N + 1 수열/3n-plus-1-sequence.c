#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    scanf("%d", &n);
    int a;
    a=n;
    int cnt=0;
    while(1){
        if(a==1){
            break;}
        if(a%2==0){
            a=a/2;
            cnt++;
        }
        else{
            a=a*3+1;
            cnt++;
        }
    }
    printf("%d", cnt);
    return 0;
}