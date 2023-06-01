import Animal
import Cat
import Dog
import Horse
import Veterinarian

fun main(){
    var arr : Array<Animal> = arrayOf(
        Dog("meat", "Europe", "Saint Bernard"),
        Cat("milk", "Asia", 8),
        Horse("grass", "Africa", 80)
    )
    var veterinarian = Veterinarian()
    for(i in 0..arr.size-1)
            veterinarian.treatAnimal(arr[i])


}
