import Animal

class Cat(food: String, location: String, timeToPlay: Int) : Animal(food, location)  {
    var timeToPlay=timeToPlay

    override fun makeNoise() {
        println("Кошка мяукает")
    }

    override fun eat() {
        println("Кошка ест")
    }

}