/**
 * 闭包（可以访问一个函数里面局部变量的另外一个函数，可以理解为是一个有状态的函数）
 * 应用场景？
 */
 object ClosuresTest{
     def main (args: Array[String]){
         var result, i=0;
         for(i <- 1 to 10){
             result += closuresMethods(1)
         }
         println(result)
     }

    var out = 10
    var closuresMethods = (a: Int) => a + out
 }