import Animal

class Dog(food: String, location: String, kind: String) : Animal(food, location) {
    var kind = kind

    override fun makeNoise() {
        println("Собака лает")
    }

    override fun eat() {
        println("Собака ест")
    }
}