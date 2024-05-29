import java.util.*

fun calculate(courtType: CourtType, entityType: EntityType, value : Double) : Double { // Здесь нужно будет прописать формулы рассчета
    when (courtType) {
        CourtType.ARBITRAG -> when (entityType) {
            EntityType.INDIVIDUAL -> if(value <= 100_000) value * 4 / 100
            EntityType.LEGAL -> TODO()
        }

        CourtType.COMMON -> TODO()
    }
    return ((courtType.percent * value) / 100) + ((entityType.percent * value) / 100)
}

fun Int.percentOf(value: Int) : Int {
     return (value * this) / 100
}

fun giveOption() : Int {
    val scan = Scanner(System.`in`)

    var value = 0
    while (true) {
        try {
            value = scan.nextInt()
        } catch (e: Exception) {
            println("Некорректный ввод")
            scan.next()
            continue
        }

        if(value > 2 || value < 1) {
            println("Такой опции нет")
            continue
        }
        break
    }

    return value
}

fun giveInt() : Int {
    val scan = Scanner(System.`in`)

    var value = 0
    while (true) {
        try {
            value = scan.nextInt()
        } catch (e: Exception) {
            println("Некорректный ввод")
            scan.next()
            continue
        }
        break
    }

    return value
}