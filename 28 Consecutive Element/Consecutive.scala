import scala.annotation.tailrec;

object Consecutive{

    def eleminateConsecutive(myList: List[Any]): List[Any] = {
        @tailrec 
        def elimRec(lst1: List[Any], stack: List[Any]): List[Any] = {
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
        val lst : List[Any] = List(5, 5, 6, 34, 34, 23, 23, 89, 26, 877, 90, 90);
        println("\nAfter eliminating\n"+eleminateConsecutive(lst));

    }
}