package paul

fun main(arg: Array<String>){
    var person = Person()

    with(person){
        name = "Paul"
        age = 48
    }

    person.apply {
        name = "Bella"
    }

    print(person.name)
}

class Person {
    var name: String = ""
    var age: Int = -1

    fun startRun(){
        print("This is startRun method")
    }
}