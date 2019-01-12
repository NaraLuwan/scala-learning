object HelloWorld{

    // var 变量  val 常量
    val begin: String = "Hello scala!"
    // 同 val begin = "Hello scala!" 编译器会自动推断出类型，如何实现的？HindleyMilner推导器？

    def main(args: Array[String]){
        println( begin )
    }
}