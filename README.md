# Say hello to the programming world
Show how the basic thing are written in different programming languages.

## Table of contents
- [Perl](#perl)
- [C](#c)
- [C plus plus](#c-plus-plus)
- [C Sharp](#c-sharp)
- [Java](#java)
- [Ruby](#ruby)
- [Python](#python)
- [Javascript](#javascript)
- [Objective C](#objective-c)
- [Swift](#swift)
- [Groovy](#groovy)

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
## C plus plus
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
## Objective C
Say hello
```objective-c
#include <stdio.h>
#include <objc/objc.h>

void printOnScreen(char *quote, char *author, int age) {
    printf("%s - %s, - %d\n", quote, author, age);
}


int main (int argc, const char * argv[])
{
    printOnScreen("Hello", "Friends", 32);
}
```
### Compile Objective C code
```bash
~ clang -fobjc-arc -framework Foundation hello.m -o hello
~ ./hello
```
## Swift
Calculate fibonacci number
```swift
#!/usr/bin/swift

func fibonacci(_ n: Int) -> Int {
    if n <= 2 {
        return 1
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2)
    }
}

let arg = CommandLine.arguments[1]
if let n = Int(arg) {
    print(fibonacci(n))
} else {
    print("Usage: fibonacci <n>")
}

```
Run Swift code
```bash
~ chmod u+x fibonnaci.swift
~ ./fibonacci.swift 10
```
Compile Swift code
```bash
~ swiftc -o fibonacci fibonacci.swift
~ ./fibonacci 10
```

## Groovy
Function arguments typing
```groovy
class Person{
    String first, last
}


def printInfo(first, second){
  println "first name: $first, second name: $second"
}


def printFirstName(user){
  println "user: $user.first"
}


def temp = new Person(first: 'Adam', last: 'Smith')
printInfo(temp.first, temp.last)
printFirstName(temp)


def functionA(String str) {
    println str
}

int functionB(int argB) {
    argB + 2
}

String functionC() {
    "Hello World"
}


functionA('String')
println functionB(10)
def fc = functionC()
println fc
```

Define closure method

```groovy
class ClassWithClosure {
    private int member = 20

    static private String method()
    {
        return "hello"
    }

    def publicMethodWithClosure(String name_)
    {
        def localVar = member + 5
        def localVar2 = "Parameter: ${name_}"
        

        return {
            println "${member} ${name_} ${localVar} ${localVar2} ${method()}"
        }
    }
}

ClassWithClosure sample = new ClassWithClosure()
def closureVar = sample.publicMethodWithClosure("Xavier")
closureVar()
```

Define interfaces

```groovy
interface Voice {
    void voice()
    String getName()
    String go()
}


class HRC implements Voice {

    @Override
    void voice() {
        println "Voice"
    }

    @Override
    String getName() {
        return HRC.class.getSimpleName()
    }

    @Override
    String go() {
        "${HRC.class.getSimpleName()} is Moving"
    }
}

def instance = new HRC() as Voice

instance.voice()
println instance.go()
println  "Name is ${instance.getName()}"
```

Define abstract classes

```groovy
abstract class Shape {
    final name
    Shape(name) {this.name = name}
    abstract printName()
    abstract area()
}


class Circle extends Shape {
    final radius
    Circle(radius) {
        super('circle')
        this.radius = radius
    }
    def area() {
        println "Area equals to ${Math.PI * radius * radius}"
    }
    def printName() {
        println "I am a $name"
    }
}


class Rectangle extends Shape {
    final length, breadth
    Rectangle(length, breadth) {
        super("rectangle")
        this.length = length
        this.breadth = breadth
    }

    def printName() {
        println "I am a $name."
    }

    def area() {
        println "Area aquals to ${this.length * this.breadth}"
    }
}



Shape circle = new Circle(10)
Shape rectangle = new Rectangle(10, 20)
circle.printName()
circle.area()
rectangle.printName()
rectangle.area()

```

## Contributing

### Setup
- clone the repository
- configure Git for the first time after cloning with your name and email
  ```bash
  git config --local user.name "Volodymyr Yahello"
  git config --local user.email "vyahello@gmail.com"
  ```
