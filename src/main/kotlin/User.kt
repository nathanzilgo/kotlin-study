open class User (
    val name: String,
    val nickname: String,
    val age: Int,
    val role: String,
    val bio: String
    ) {

    fun <T> List<T>.count(function: (T) -> Boolean): Int {
        var counter = 0
        val charBitSize = 16
        for (string in this) {
            if (function(string)) {
                counter++
            }
        }
        return counter * charBitSize
    }

    /**
     * #TODO: verificar se é true
     * Conta os bits das variaveis de um objeto User
     */
    fun countBits(charBitSize: Int = 16, intBitSize: Int = 32): Int {
        var counter = 0
        for (string in listOf(name, nickname, age, role, bio)) {
            counter += when (string) {
                is String -> charBitSize * string.length
                is Int -> intBitSize
                is Float -> intBitSize
                else -> 0
            }
        }
        return counter
    }
}
