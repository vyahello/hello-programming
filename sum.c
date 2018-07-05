#include<stdio.h>
/* function returning sums of two numbers */

int sum();

int main(){
        int a = 100;
        int b = 200;
        int result;

        result = sum(a, b);
        printf("Sum of %d and %d is %d\n", a, b, result);
        return 0;
}


int sum(int num1, int num2) {
 /* local variable declaration */
     return num1 + num2;
}