#include <stdio.h>

int main() {
    // Please write your code here.
    char a, c, e;
    int b, d, f;
    scanf("%c %d %c %d %c %d", &a, &b, &c, &d, &e, &f);
    if(a=='Y'&&b>=37){
        if(c=='Y'&&d>=37){
            printf("E");
        }
        else if(e=='Y'&&f>=37){
            printf("E");
        }
        else{
            printf("N");
        }
    }
    else if((c=='Y'&&d>=37)&&(e=='Y'&&f>=37)){
        printf("E");
    }
    else{
        printf("N");
    }
    return 0;
}