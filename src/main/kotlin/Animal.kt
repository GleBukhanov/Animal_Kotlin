open class Animal(food:String,loction:String) {
    var food=food
    var location=loction

    open fun makeNoise(){
        println("Животное издаёт звуки")
    }

    open fun eat(){
        println("Животное ест")
    }

    open fun sleep(){
        println("Животное спит")
    }
}