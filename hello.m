#include <stdio.h>
#include <objc/objc.h>

void printOnScreen(char *quote, char *author, int age) {
    printf("%s - %s, - %d\n", quote, author, age);
}


int main (int argc, const char * argv[])
{
    printOnScreen("Hello", "Friends", 32);
}
