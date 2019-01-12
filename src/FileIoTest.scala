import java.io._
import scala.io.Source

object Test {
   def main(args: Array[String]) {
      val writer = new PrintWriter(new File("test.txt"))

      writer.write("something")
      writer.write("\n")
      writer.write("...")
      writer.close()
      
      println("write end")

      // 依赖 scala.io.Source 包
      Source.fromFile("test.txt").foreach{ 
         print
      }
   }
}