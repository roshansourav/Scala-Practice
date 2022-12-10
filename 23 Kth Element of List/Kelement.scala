// 99-03 Find the Kth element of a list. 
import java.io._;

object Kelement{
    def kthElement(n : List[Int], k : Int) : Int = {
        return n(k);
    }

    def main(ar : Array[String]){
        var ls1 : List[Int] = List(7, 8, 3, 8, 6, 2, 3, 2); 
        var k : Int = 0
        println("Printing List : "+ls1);
        print("\nEnter the value of k : \t");
        k = (scala.io.StdIn.readLine()).toInt;
        if(k<=0 || k> ls1.length)
            println("K position is out of bound");
        else
            print("\nKth element = \t"+kthElement(ls1, k-1));
        println();
    }
}