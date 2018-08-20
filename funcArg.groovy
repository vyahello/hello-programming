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