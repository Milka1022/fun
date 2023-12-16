import kotlin.random.Random

fun main() {
    val choices = arrayOf("камень", "ножницы", "бумага")
    val computerChoice = choices[Random.nextInt(3)]

    println("Выберите свой вариант:")
    println("1 - камень")
    println("2 - ножницы")
    println("3 - бумага")

    val playerChoice = when(readLine()){
        "1" -> "камень"
        "2" -> "ножницы"
        "3" -> "бумага"
        else -> {
            println("Неправильный ввод, попробуйте еще раз.")
            return
        }
    }

    println("Выбор компьютера: $computerChoice")
    println("Ваш выбор: $playerChoice")

    if(computerChoice == playerChoice) {
        println("Ничья! Давайте переиграем.")
    } else if ((computerChoice == "камень" && playerChoice == "ножницы") ||
        (computerChoice == "ножницы" && playerChoice == "бумага") ||
        (computerChoice == "бумага" && playerChoice == "камень")) {
        println("Компьютер победил!")
    } else {
        println("Вы победили!")
    }
}