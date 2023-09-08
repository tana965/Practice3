import java.util.*
import kotlin.math.sqrt


fun main(args: Array<String>) {
// 1 номер
    val myAge = 18
    val isTeenager: Boolean = 13<=myAge && myAge<=19
/////
// 2 номер
    val myAge = 18
    val isTeenager: Boolean = 13<=myAge && myAge<=19
    val theirAge = 30
    val bothTeenagers: Boolean = (13<=myAge && myAge<=19) && (13<=theirAge && theirAge<=19)
/////
// 3 номер
    val reader = "Дана"
    val author = "Richard Lucas"
    val authorIsReader: Boolean = reader == author
/////
// 4 номер
    val reader = "Дана"
    val author = "Richard Lucas"
    val authorIsReader: Boolean = reader == author
    val readerBeforeAuthor: Boolean =  reader < author
/////
// 5 номер
    val myAge2  = 18
    if (13<=myAge2 && myAge2<=19){
        println("Подросток")
    } else{
        println("Не подросток")
    }
/////
//6 номер
    val myAge2  = 18
    val answer = if (13<=myAge2 && myAge2<=19) "Подросток" else "Не подросток"
    println(answer)
/////
//7 номер
    var counter = 0
    while(counter<10){
        counter +=1
        println("Counter = $counter")
    }
/////
// 8 номер
    var counter = 0
    var roll = 0

    do{
        roll = Random().nextInt(9)
        counter += 1
        println(" После $counter, roll равен $roll ")
    }while(roll != 0)
/////
// 9 номер
    val range = 1..10
    for(i in range){
        println((Math.pow(i.toDouble(), 2.0)).toInt());
    }
/////
// 10 номер
    val range = 1..10
    for(i in range){
        println(sqrt(i.toDouble()))
    }
/////
// 11 номер
    var sum =0
    for ( row in 1 until 8 step 2){
        for(column in 0 until 8){
            sum += row * column
        }
    }
    println(sum)
/////

    }


