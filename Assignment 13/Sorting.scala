import scala.io.StdIn

object BubbleSort {
    def bubbleSort(arr: Array[Int]): Array[Int] = {
        val n = arr.length
        for(i <- 0 until n) {
            for(j <- 0 until n - i - 1) {
                if(arr(j) > arr(j + 1)) {
                    val temp = arr(j)
                    arr(j) = arr(j + 1)
                    arr(j + 1) = temp
                }
            }
        }
        arr
    }

    def main(args: Array[String]): Unit = {
        println("Enter number of elements:")
        val n = StdIn.readInt()

        val arr = new Array[Int](n)

        println("Enter elements:")
        for(i <- 0 until n) {
            arr(i) = StdIn.readInt()
        }

        val sorted = bubbleSort(arr)

        println("Sorted Array:")
        sorted.foreach(x => print(x + " "))
    }
}