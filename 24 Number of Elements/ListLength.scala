object ListLength{
    def lengthByPreDefinedFun(n : List[Int]) : Int = {
        return n.length;
    }

    // def lengthByUserDefinedFun(n : List[Int]) : Int = {
    //     var counter : Int = 0
        
    //     return counter;
    // }

    def main(arg : Array[String]){
        var ls1 : List[Int] = List(2, 6, 9, 2, 4, 8, 76, 54, 22);
        print("\nList length by predefined length function : \t"+lengthByPreDefinedFun(ls1));
        // print("\nList length by user defined function : \t"+lengthByUserDefinedFun(ls1));
        println();
    }
}