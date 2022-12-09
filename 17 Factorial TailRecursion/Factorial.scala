// 05 Find factorial of a number using tail recursion

import java.io._;
import scala.annotation.tailrec;

object Factorial{

    def fact(n : Int) : Int = {

        @tailrec
        def factNew(acc : Int, n : Int) : Int = {
            if(n <= 1)
                acc;
            else
                factNew(n*acc, n-1);
        }
        factNew(1, n);
    }

    def main(ar : Array[String]){
        var input : Int = 0;
        print("\nEnter number : \t");
        input = (scala.io.StdIn.readLine()).toInt;
        println("\nFactorial of "+input+" = \t"+fact(input));
    }

}