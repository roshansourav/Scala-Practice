// Print the Fibonaccci Series using Tail Recursion upto a given range

import java.io._;
import scala.annotation.tailrec;

object Fibonacci{

    def fiboWhile(n : Int){
        var currentVal1 : Int = 0;
        var currentVal2 : Int = 1;
        var tempVal : Int = 0;
        var counter : Int = 0;

        while(counter < n){
            tempVal = currentVal1 + currentVal2;
            print("\t"+tempVal);
            currentVal1 = currentVal2;
            currentVal2 = tempVal;
            counter = counter + 1;
        }

    }//using while loop ends here


    def fiboTailRecursion(val1 : Int, val2 : Int, n : Int)  ={

        @tailrec
        def fiboTail(acc : List[Int], val1 : Int, val2 : Int, n : Int): List[Int] =
        {

            if(n < 1 ){
                acc
            }
            else{
                 val nextValue = val1 + val2;
                fiboTail(acc :+ nextValue, val2, nextValue, n-1);
            }
        }
        println(fiboTail(List(), val1, val2, n))

    }



    def main(ag : Array[String]){
        var inputN : Int = 0;
        print("\nEnter the number of terms, you want to print : \t");
        inputN = (scala.io.StdIn.readLine()).toInt;
        if(inputN < 1)
            println("Less than 1 Not Allowed");
        else
        {
            println("\nFibonacci series upto "+inputN+" using While Loop");
            fiboWhile(inputN);
            println("\nFibonacci series upto "+inputN+" using Tail Recursion");
            fiboTailRecursion(0, 1, inputN);
        }

        println();
    }
}