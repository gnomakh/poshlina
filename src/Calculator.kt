import java.util.*

class Calculator {
    val scan = Scanner(System.`in`)
    var courtType: CourtType? = null
    var entityType: EntityType? = null

    fun start() {
        println("Ввыберите тип суда:\n" +
                "1. Суд общей юрисдикции\n" +
                "2. Арбитражный суд")

        val courtType = if(giveOption() == 1) CourtType.COMMON else CourtType.ARBITRAG

        println("Ввыберите тип лица:\n" +
                "1. Физическое лицо\n" +
                "2. Юридическое лицо")

        val entityType = if(giveOption() == 1) EntityType.INDIVIDUAL else EntityType.LEGAL
        print("Введите цену иска: ")
        println("Стоимость госпишлины составит ${calculate(courtType, entityType, giveInt())}")
    }

}