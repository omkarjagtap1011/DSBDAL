import scala.io.StdIn

object WordCount {
    def main(args: Array[String]): Unit = {
        println("Enter a sentence:")
        val input = StdIn.readLine()

        val words = input.split(" ")

        val wordMap = scala.collection.mutable.Map[String, Int]()

        for(word <- words) {
            if(wordMap.contains(word)) {
                wordMap(word) += 1
            } else {
                wordMap(word) = 1
            }
        }

        println("Word Count:")
        for((word, count) <- wordMap) {
            println(s"$word -> $count")
        }
    }
}