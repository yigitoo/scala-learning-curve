import scala.io.StdIn.{readLine, readInt}
import scala.math._
import java.io.PrintWriter
object Learn {
  def main(args: Array[String]) =
  {
    def getSum(args: Int*) : Int = 
    {
      var sum : Int = 0
      for (num <- args)
      {
        sum += num
      }
      
      return sum
    }

    def factorial(num: BigInt) : BigInt =
    {
      if(num <= 1)
        return 1
      else
        return num * factorial(num - 1)
    }
    
    val numList: Array[Int] = new Array[Int]()
    for (i <- 1 to numList.length)
      numList(i - 1) = i
      println(numList(i - 1))
    println(numList)
  }
}
