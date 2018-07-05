#include<stdio.h>

void printArray(int *a, int len){
    for (int i = 0; i < len; i++)
    printf("%d\n", a[i]);
}

int main(){
    int data[] = {1, 2, 3, 4};
    printArray(data, 4);
    return 0;
}