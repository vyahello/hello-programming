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
        println "Area equals to ${this.length * this.breadth}"
    }
}



Shape circle = new Circle(10)
Shape rectangle = new Rectangle(10, 20)
circle.printName()
circle.area()
rectangle.printName()
rectangle.area()
