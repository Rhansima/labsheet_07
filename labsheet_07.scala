object labsheet_07 {
  println("q01")
  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5,6,7,8,9,10)
    val outputList1 = filterEvenNumbers(inputList)
    println(outputList1)

    println("q02")
    val outputList2 = calculateSquare(inputList)
      println(outputList2)

    println("q03")
    val outputList3 = filterPrime(inputList)
    println(outputList3)


  }
 //question 01
  def filterEvenNumbers(inputList: List[Int]): List[Int] = {
    inputList.filter(number => number %2 ==0)
  }

  //question 02
  def calculateSquare(inputList:List[Int]):List[Int]={
    inputList.map(number=> number*number)
  }
  //question 03
  def filterPrime(inputList: List[Int]): List[Int] = {
    def isPrime(num: Int): Boolean = {
      if (num <= 1) false
      else if (num <= 3) true
      else {
        val sqrtNum = math.sqrt(num).toInt
        !(2 to sqrtNum).exists(num % _ == 0)
      }
    }

    inputList.filter(isPrime)
  }


  }
