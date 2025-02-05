#include <stdio.h>

int main() {
    // Please write your code here.
    int n;
    scanf("%d", &n);
    int c1=0;
    int c2=0;
    int c3=0;
    for(int i=1; i<=n; i++){
        if(i%12==0){
            c3++;
        }
        else if(i%3==0){
            c2++;
        }
        else if(i%2==0){
            c1++;
        }
    }
    printf("%d %d %d", c1, c2, c3);
    return 0;
}