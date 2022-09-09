class Octal(value: Int) {
    fun octToDecimal(value: Int): Int {
        var temoraryVariable = value.toString().reversed()
        var outputConsole = 0
        var exponent = 0.0
        for (element in temoraryVariable) {
            outputConsole += element.digitToInt() * Math.pow(8.0, exponent).toInt()
            exponent++
        }
        return outputConsole
    }
}
