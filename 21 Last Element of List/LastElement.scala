// 99-01 Find the last element of a list. 

import scala.collection.immutable._;

object LastElement{

    def findLast(n : List[Int]) : Any = {
        return n.last;
    }

    def main(ar : Array[String]){
        var ls1 : List[Int] = List(7, 8, 3, 8, 6, 2, 3, 2); 
        println("Printing List : "+ls1);
        print("\nLast element = \t"+findLast(ls1));
        println();
    }
}