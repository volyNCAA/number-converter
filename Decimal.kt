class Decimal(converter: Int) {
    fun decimalToBinary(value: Int): String {
        var temporaryVariable = value
        var outputConsole = ""
        while (temporaryVariable > 0) {
            outputConsole += temporaryVariable % 2
            temporaryVariable /= 2
        }
        return outputConsole.reversed()
    }
    fun decimalToHex(value: Int): String {
        var temporaryVariable = value
        var outputConsole = ""
        val hexChars = mutableListOf(
            "0",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "A",
            "B",
            "C",
            "D",
            "E",
            "F"
        )
        while (temporaryVariable > 0) {
            outputConsole += hexChars[temporaryVariable % 16]
            temporaryVariable /= 16
        }
        return outputConsole.reversed()
    }
    fun decimalToOct(value: Int): String {
        var temporaryVariable = value
        var outputConsole = ""
        while (temporaryVariable > 0) {
            outputConsole += temporaryVariable % 8
            temporaryVariable /= 8
        }
        return outputConsole.reversed()
    }
}
