/**
 * 模式匹配：选择器 match {备选项} 
 * 对应 Java 里的 switch
 */
object Test {
   def main(args: Array[String]) {
      println(matchTest(3))

   }
   def matchTest(x: Int): String = {
       x match {
        case 1 => "one"
        case 2 => "two"
        case _ => "many"
       }
   }
}