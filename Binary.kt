class Binary(number: Long) {
    fun binaryToDecimal(value: Long): Int {
        var temoraryVariable = value.toString().reversed()
        var outputConsole = 0
        var exponent = 0.0
        for (element in temoraryVariable) {
            outputConsole += element.digitToInt() * Math.pow(2.0, exponent).toInt()
            exponent++
        }
        return outputConsole
    }
}
