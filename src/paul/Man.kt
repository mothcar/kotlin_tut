package paul

fun main(args: Array<String>) {
//    var per: Man.printPerson()

//    var per = Man("코틀리 kotlin")
//    per.fullName=""

//    println(per.fullName)

//    val obj = cc()
//    obj.absD()
//    obj.f()

//    val (name, age) = Pair("Paul", 48)
//    println("$name is Good man")


//    val thread = Thread(object : Runnable {
//        override fun run() {
//            println("Running in object")
//        }
//    })

//    val thread = Runnable { println("Running in object in shourt") }
//    thread.run()

//    println(MyCompanion.test())


}

interface Cb {
    fun callbackMethod(){}
}

class Callee : Cb {

    fun test() {
    }

    override fun callbackMethod() {
        println("Callback method is called")
    }


}

class Callee2 : Cb {

    override fun callbackMethod() {
        println("callee2 ")
    }
    constructor(sthCall: Cb) {
    }
    fun doWork(callb: Cb) {
        println("Callee2 is running")
    }
}

class MyCompanion {
    val name: String = "Paul"

    fun myPrint(){
        println("This is mycompanion $name")
    }

    companion object Factory {
        fun test() : MyCompanion = MyCompanion()
    }
}

class MyThread : Runnable {
    override fun run() {
        println("Running")
    }
}


class Man(var fullName: String)


open class AA(){
    open fun f(){
        println("AAAAAAAA")
    }

}

interface BB {
    fun f(){
        println("BBBBBBB")
    }
}

abstract class DD() {
    abstract fun absD()

}

class cc : DD(), BB{
    override fun absD() {
        println("implement DD")
    }

    override fun f(){
        super.f()
    }
}




