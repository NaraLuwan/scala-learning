/**
 * 方法和函数
 * 方法是类的一部分，而函数是一个对象可以赋值给一个变量
 */
object MethodTest{
    def addMethod(a:Int, b:Int) : Int = {
        var sum = 0;
        if(a.eq(null) || b.eq(null)){
            return sum;
        }
        sum = a + b;
        return sum;
    }

    def main(args: Array[String]){
        var sum = addMethod(1,2);
        println("sum = " + sum);
    }
}