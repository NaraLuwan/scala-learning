object CollectionTest{

    // 空列表
    val empty = Nil
    
    val site: List[String] = List("Runoob", "Google", "Baidu")
    // 同 val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))

    def main (args: Array[String]){
      if(!site.isEmpty){
        println( "first : " + site.head )
        println( "last : " + site.tail )
      }

    colors.keys.foreach{
        i => println( "Key = " + i +" Value = " + colors(i))
    }

      if(colors.contains("red")){
          println(colors("red"))
      }
    }

    val colors = Map("red" -> "red color", "blue" -> "blue color")

}