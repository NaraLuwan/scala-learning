import Array._

object ArrayTest{

    var nums = new Array[Int](3)

    nums(0) = 1;nums(1) = 2;nums(2) = 3

    def main (args: Array[String]){
        for(i <- nums){
            println(i)
        }

        var max = nums(0);
        for(i <- 1 to (nums.length - 1)){
            if(nums(i) > max) {
                max = nums(i)
            }
        }
        println("最大值为：" + max)

        // 合并数组
        var nums2 = Array(4,5)
        var nums3 = concat(nums, nums2)

        for(i <- nums3){
            println(i)
        }
    }
}