// 99-06 Find out whether a list is a palindrome.

object ListPalindrome{

    def listReverse(n : List[Int]) : String ={
        if(n == n.reverse)
            return "Palindrome";
        else
            return "Not Palindrome";
    }

    def main(arg : Array[String]){
        var lst1 : List[Int] = List(323, 45, 676, 22, 98, 56, 1);
        print("\nList1 is "+listReverse(lst1));

        var lst2 : List[Int] = List(323, 45, 676, 22, 676, 45, 323);
        print("\nList2 is "+listReverse(lst2));
        
        println();
        
        
    }
}

