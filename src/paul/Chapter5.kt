package paul

fun main(args: Array<String>) {

//    range()
//    express()
//    perimeter()

    extract2()

}

//fun recurse(var value: String): String {
//    i
//
//}

fun express() {
    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}

fun checking() {
    val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}

fun range4() {
    val x = 91

    when(x) {
        in 91..100 -> print("A\n")
        in 80..90  -> print("B\n")
        80  -> print("C")
        else -> print("so What?")
    }
}

fun range3() {
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}

fun range2() {
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range\n")
    }
    if (list.size !in list.indices+1) {
        println("list.size : ${list.size}")
        println("list.indices: ${list.indices}")
        println("list size is out of valid list indices range too\n")
    }
}

fun range(){
    val x = 11
    val y = 9

    if(x in y..y+1) print("fits in Range\n")

}

fun hasPrefix(x: Any) = when(x) {
    is String -> print("This type is String\n")
    else -> print ("Some type")
}

fun itermethod() {
    var collect = listOf(1, 2, 3, 4)
    collect.iterator()

    for(x in collect)
        print("$x\n")
}

fun extract2() {
    val member = listOf("Paul", "Davie", "Susan", "Bella", "해룡")

    member.forEach {
                if(it == "해룡") return@forEach
                println(it)
            }

    println("End")
}

fun extract() {
    val member = listOf(0,1,2,3)

    member.forEach(
        fun(value: Int) {
            if(value == 2) return
            println(value)
        }
    )

    println("End")

}

fun perimeter() {
    val rectangle = Rectangle(6.0, 2.0) //no 'new' keyword required
    val triangle = Triangle(3.0, 4.0, 5.0)
    println("Area of rectangle is ${rectangle.calculateArea()}, its perimeter is ${rectangle.perimeter}")
    println("Area of triangle is ${triangle.calculateArea()}, its perimeter is ${triangle.perimeter}")
}

abstract class Shape(val sides: List<Double>) {
    val perimeter: Double get() = sides.sum()
    abstract fun calculateArea(): Double
}

interface RectangleProperties {
    val isSquare: Boolean
}

class Rectangle(
        var height: Double,
        var length: Double
) : Shape(listOf(height, length, height, length)), RectangleProperties {
    override val isSquare: Boolean get() = length == height
    override fun calculateArea(): Double = height * length
}

class Triangle(
        var sideA: Double,
        var sideB: Double,
        var sideC: Double
) : Shape(listOf(sideA, sideB, sideC)) {
    override fun calculateArea(): Double {
        val s = perimeter / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}


