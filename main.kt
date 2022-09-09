fun main() {
    println("lets choose of system from: ")
    val systemFrom = readln().toInt()
    println("lets choose of system to: ")
    val systemTo = readln().toInt()
    print("input a number: ")
    var number = readln()
    if (systemFrom == 10) {
        if (systemTo == 2) {
            val converter = Decimal(number.toInt()).decimalToBinary(number.toInt())
            print("result is $converter")
        }
        if (systemTo == 16) {
            val converter = Decimal(number.toInt()).decimalToHex(number.toInt())
            print("result is $converter")
        }
        if (systemTo == 8) {
            val converter = Decimal(number.toInt()).decimalToOct(number.toInt())
            print("result is $converter")
        }
    }
    if (systemFrom == 2) {
        if (systemTo == 10) {
            val converter = Binary(number.toLong()).binaryToDecimal(number.toLong())
            print("result is $converter")
        }
        if (systemTo == 8) {
            val converter = Binary(number.toLong()).binaryToDecimal(number.toLong())
            val consoleResult = Decimal(converter).decimalToOct(converter)
            print("result is $consoleResult")
        }
        if (systemTo == 16) {
            val converter = Binary(number.toLong()).binaryToDecimal(number.toLong())
            val consoleResult = Decimal(converter).decimalToHex(converter)
            print("result is $consoleResult")
        }
    }
    if (systemFrom == 8) {
        if (systemTo == 16) {
            val converter = Octal(number.toInt()).octToDecimal(number.toInt())
            val consoleResult = Decimal(converter).decimalToHex(converter)
            print("result is $consoleResult")
        }
        if (systemTo == 10) {
            val converter = Octal(number.toInt()).octToDecimal(number.toInt())
            print("result is $converter")
        }
        if (systemTo == 2) {
            val converter = Octal(number.toInt()).octToDecimal(number.toInt())
            val consoleResult = Decimal(converter).decimalToBinary(converter)
            print("result is $consoleResult")
        }
    }
    if (systemFrom == 16) {
        if (systemTo == 10) {
            val converter = Hexadecimal(number).hexToDecimal(number)
            print("result is $converter")
        }
        if (systemTo == 2) {
            val converter = Hexadecimal(number).hexToDecimal(number)
            val consoleResult = Decimal(converter).decimalToBinary(converter)
            print("result is $consoleResult")
        }
        if (systemTo == 8) {
            val converter = Hexadecimal(number).hexToDecimal(number)
            val consoleResult = Decimal(converter).decimalToOct(converter)
            print("result is $converter")
        }
    }
}
