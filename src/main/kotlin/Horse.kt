import Animal

class Horse(food: String, location: String, speed: Int) : Animal(food, location)  {
    var speed=speed

    override fun makeNoise() {
        println("Лошадь ржёт")
    }

    override fun eat() {
        println("Лошадь есть")
    }
}