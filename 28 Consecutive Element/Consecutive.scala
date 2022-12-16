//99-08 Eliminate consecutive duplicates of list elements. 

import scala.annotation.tailrec;

object Consecutive{

    def eleminateConsecutive(myList: List[Int]): List[Int] = {
        @tailrec 
        def elimRec(lst1: List[Int], stack: List[Int]): List[Int] = {
            (lst1, stack) match {
            case (Nil, s) => s
            case (hd :: tl, Nil) => elimRec(tl, List(hd))
            case (hd :: tl, a :: b) => 
                if (hd == a) elimRec(tl, stack) 
                else elimRec(tl, hd :: stack)
        }
    }
  elimRec(myList, Nil).reverse
}

    def main(ags : Array[String]){
        val lst : List[Int] = List(5, 5, 6, 34, 34, 23, 23, 89, 26, 877, 90, 90)
        println("\nAfter eliminating\n"+eleminateConsecutive(lst))

    }
}