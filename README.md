# Say hello to the programming world
Show how the basic thing are written in different programming languages.

## Perl
```bash
~ perl -e 'print "Hello World\n"'
```
## C
Sum of two integers
```c
#include<stdio.h>
/* function sums of two numbers */
int sum();

int main(){
        int result;
        result = sum(10, 20);
        printf("Sum of 10 and 20 is %d\n", result);
        return 0;
}


int sum(int num1, int num2) {
 /* local variable declaration */
     return num1 + num2;
}
```
Sum of two integers
```c
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
```
Find element in array
```c
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
```
Get number from an array
```c
#include<stdio.h>

int mark[5] = {19, 10, 8, 17, 9};

int main() {
    printf("%d\n", mark[2]);
    return 0;
}
```
Print an array
```c
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
```
Get `pi` number
```c
#include <math.h>
#include <stdio.h>

int main(int argc, char **argv) {
    int k;
    double acc = 0.0;

    for(k=0; k<10000; k++) {
        acc = acc + pow(-1, k)/(2*k+1);
    }

    acc = 4 * acc;
    printf("pi: %.15f\n", acc);

    return 0;
}
```
Say hello world
```c
#include<stdio.h>

void main()
{
    printf("Hello World\n");

}
```
### Compile C code
```bash
~ cc hello.c -o hello.out  # compile
~ ./h.out  # run code
```
## C ++
Sum of two integers
```cpp
#include<iostream>
using namespace std;

int sum(int a, int b);

int main(){
        int res;
        int a = 15;
        int b = 20;
        res = sum(a, b);
        cout << "Sum is " << res << endl;
        return 0;
}


int sum (int a, int b){
        int res;
        res = a + b;
        return (res);

}
```
Say hello world
```cpp
#include<iostream>
using namespace std;

void printSome();

int main(){
        printSome();
        return 0;
}


void printSome(){
        cout << "I'm text" << endl;

}
```
### Compile C ++ code
```bash
~ g++ hello.cpp -o hello.out  # compile
~ ./basic.out  # run code
```
## C Sharp
```cs
using System;


namespace printhello
{
  class printhello
  {

    public static void Main(string[] args)
    {
      System.Console.WriteLine("hello");
    
    }
  }


}
```
### Compile C Sharp code
```bash
~ csc printhello.cs  # compile
~ mono printhello.exe  # run C # code
```
## Java
```java
class HelloWorld{
        public static void main (String[] args)
        {
                System.out.println("Hello World");
        }
}
```
### Compile Java code
```bash
~ javac hello.java  # compile the code
~ java HelloWorld  # run the code
```
## Ruby
Say hello
```rb
def say_hello()
  puts "Say hello"
  end

say_hello
```
Find element in array
```rb
def element_in_array(element, array)
  if array.include?(element)
    return "#{element} in array"
  else "Not found"
  end
end

puts element_in_array 10, [1, 11, 10]

```
### Run ruby code
```bash
~ ruby find.rb
```
## Python
Say hello
```python
def say_hello() -> str:
    return 'Hello friends!'

print(say_hello())

```
### Run python code
```bash
~ python hello.py
```
## JavaScript
Sum numbers
```js
function add() {
    var tempValue = 0;
    for (i = 0; i < arguments.length; i ++)
    {
        tempValue += arguments[i]
    }
    return tempValue;
}
var myValue = add(1, 2, 3, 4);
alert(myValue);


var addme = function () {
    var tempValue = 0;
    for (i = 0; i < arguments.length; i++) {
        tempValue += arguments[i]
    }
    return tempValue;
}

alert(addme(5, 10, 15));

var addMeOnceMoreTime = (function () {
    return arguments[0] + arguments[1];
})(1, 3);

alert(addMeOnceMoreTime);

```
Substitute webElement with input text
```js
function substitute() {
    var myValue = document.getElementById('myTextBox').value;
    if (myValue.length === 0) {
        alert('Please enter a real value in the text box');
        return;
    }
    var myTitle = document.getElementById('title');
    myTitle.innerHTML = myValue;
}
```
Load JS script into HTML document
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>JavaScript Example</title>
    <script type="text/javascript" src="script.js">
    </script>
</head>
<body>
    <h1 id="title">JavaScript Example</h1>

    <input type="text" id="myTextBox"/>
    <input type="submit" value="Click me" onclick="substitute()"/>
</body>
</html>
```
## Contributing

### Setup
- clone the repository
- configure Git for the first time after cloning with your name and email
  ```bash
  git config --local user.name "Volodymyr Yahello"
  git config --local user.email "vyahello@gmail.com"
  ```