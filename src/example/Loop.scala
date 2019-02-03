package example

object Loop {

  def printOneTo(n: Int): Unit = {
    for(i <- 1 to n){
      println("i == " + i)
    }
  }

  def main(args: Array[String]): Unit = {
    printOneTo(10)
    println(1 to 10)
  }

}
