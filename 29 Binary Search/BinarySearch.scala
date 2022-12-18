import scala.annotation.tailrec

object BinarySearch{

    def searchWhile(ls : List[Int], k : Int) : Int  = {
        var low : Int = 0
        var high : Int = ls.length-1
        var mid : Int = 0
        while(low <= high){
            mid = (low + high) /2
            if(ls(mid) < k)
                low = mid +1
            else if(ls(mid) > k)
                high = mid -1
            else 
                return mid
        }
        return -1
    }

    def searchTailRecursion(ls : List[Int], k : Int) : Int ={
        @tailrec
        def seacrhTail(ls : List[Int], k : Int, low : Int, high : Int) : Int = {
            (low, high, (low+high)/2) match {
                case(_, _, mid)
                    if ls(mid) == k => mid
                case(left, _, mid)
                    if ls(mid) > k => seacrhTail(ls, k, low, mid-1)
                case(_, high, mid)
                    if ls(mid) < k => seacrhTail(ls, k, mid+1, high)
            }
        }
        seacrhTail(ls, k, 0, ls.length-1)
    }


    def main(ags : Array[String]){
        val lst : List[Int] = List(24, 49, 58, 67, 75, 89, 102, 111, 123);
        val k = 89;
        println("\nWhile loop Searching ...")
        val responseWhile : Int = searchWhile(lst, k)
        if(responseWhile < 0)
            println("\nElement "+k+" is not present");
        else
            println("\nelement "+k+" is present at "+ responseWhile)

        
        println("\nTail recursion searching ...");
        val responseTail : Int = searchTailRecursion(lst, k)
        println("\nelement "+k+" is present at "+ responseTail)

    }

}