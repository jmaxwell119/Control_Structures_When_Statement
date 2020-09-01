fun main(){

    var number = 0
    print("Enter a number between 1 and 10: ")
    number = readLine()!!.toInt()

    var numString = "x"

    when (number){
        1 -> numString = "youn"
        2 -> numString = "de"
        3 -> numString = "twa"
        4 -> numString = "kat"
        5 -> numString = "senk"
        6 -> numString = "sis"
        7 -> numString = "sèt"
        8 -> numString = "uit"
        9 -> numString = "nèf"
        10 -> numString = "dis"
        !in 1..10 -> numString = "Number out of range"
        else -> numString = "Unknown"
    }
    print("The number $number is $numString in Haitian Creole")

}