// 99-05 Reverse a list. 

import scala.collection.mutable.ListBuffer;

object ReverseList{

    def reverseByPreDefinedFun(n : List[Int]) : List[Int] = {
        return n.reverse;
    }

    def reverseByUserDefinedFun(n : List[Int]) : List[Int] = {
        var counter : Int = 0;
        counter = n.length-1;
        var lstNew = new ListBuffer[Int]();
        while(counter >= 0)
        {
            lstNew += n(counter);
            counter = counter-1;
        }
        return lstNew.toList;
    }

    def main(arg : Array[String]){
        var lst : List[Int] = List(5, 6, 34, 23, 89, 26, 877, 90);
        println("\nCurrent List = "+lst);
        println("\nAfter reversing with predefined Function = "+reverseByPreDefinedFun(lst));
        println("\nAfter reversing with userdefined Function = "+reverseByUserDefinedFun(lst));
    }
}