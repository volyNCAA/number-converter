class Hexadecimal(value: String) {
    fun hexToDecimal(value: String): Int {
        var temoraryVariable = value.toString().reversed().uppercase()
        var outputConsole = 0
        var exponent = 0.0
        for (element in temoraryVariable) {
            if (element in "ABCDEF") {
                when(element) {
                    'A' -> outputConsole += 10 * Math.pow(16.0, exponent).toInt()
                    'B' -> outputConsole += 11 * Math.pow(16.0, exponent).toInt()
                    'C' -> outputConsole += 12 * Math.pow(16.0, exponent).toInt()
                    'D' -> outputConsole += 13 * Math.pow(16.0, exponent).toInt()
                    'E' -> outputConsole += 14 * Math.pow(16.0, exponent).toInt()
                    'F' -> outputConsole += 15 * Math.pow(16.0, exponent).toInt()
                }
                exponent++
            } else if (element in "1234567890") {
                outputConsole += element.digitToInt() * Math.pow(16.0, exponent).toInt()
                exponent++
            }
        }
        return outputConsole
    }
}
