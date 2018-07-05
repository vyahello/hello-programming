#include<stdio.h>

int find_int(int required_element, int array[], int size);

int main(){
    int arr[5] = {10, 11, 2, 3, 4};
    printf("%d\n", find_int(2, arr, 10));
    return 0;

}

int find_int(int required_element, int array[], int size) {
    for (int i = 0; i < size; ++i )
        if (required_element == array[i])
            return i;
    return (-1);
}