package paul

import java.lang.reflect.Type

fun main(args: Array<String>) {

//    println(MyClass().printFoo(Sub()))
//    println(avr(3, 4))
//    println(sum(100, 200))

//    printAverage(10.2, 20.0)

//    displayGreeting(message="Nice to meet you.")
//    arith(3, 3)

    typeCheck()


}

fun typeCheck() {
    val obj = "The brown fox jump over the dog."

    if(obj is String) {
        println(" the length is ${obj.length}")
    }
}

fun arith(a: Int = 1, b: Int, c: Int =1){
    println("a is : $a, b is $b, c is $c")
}

fun displayGreeting(name: String = "Paul", message: String) {
    println("Hello, $name ! $message")
}

fun printAverage(a: Double, b: Double) {
    println("Avg of ($a, $b) = ${(a + b)/2}")
}

fun sum(a: Int, b: Int) : Int = a + b


//fun functionName(param: Type) : Type {
//    return Type
//}

fun avr(a:Int, b: Int): Int{
    return a * b / 2
}

open class Sub

class MyClass : Sub() {

    fun Sub.foo() = "This is a class"

    fun foo() = "This is a My class"
    fun printFoo(className : Sub){
        println(className.foo())
    }
}










