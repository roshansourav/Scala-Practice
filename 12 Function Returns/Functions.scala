// 01 Write a function which accepts an integer and returns whether it is even or odd.

object Functions{
    def checkEvenOdd(num : Int) : String = {
        if(num%2 == 0)
            "Even";
        else
            "Odd";
    }//checkEvenOdd closed here

    def main(ar : Array[String]){
        println("Calling evenOdd with passing 3  = "+checkEvenOdd(3));
        println("Calling evenOdd with passing 4  = "+checkEvenOdd(4));
    }
}