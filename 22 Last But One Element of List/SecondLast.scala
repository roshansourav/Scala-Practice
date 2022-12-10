// 99-02 Find the last but one element of a list. 

object SecondLast{
    def findSecondLast(n : List[Int]) : Any = {
        return n(n.length-2);
    }

    def main(ar : Array[String]){
        var ls1 : List[Int] = List(7, 8, 3, 8, 6, 2, 3, 2); 
        println("Printing List : "+ls1);
        print("\nSecond Last element = \t"+findSecondLast(ls1));
        println();
    }
}