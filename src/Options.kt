enum class CourtType(val percent: Int) {
    ARBITRAL(10),                  // У каждого типа (суда или лица) есть значение процента пошлины (условные)
    COMMON(5);
}

enum class EntityType(val percent: Int) {
    INDIVIDUAL(2),
    LEGAL(4);
}