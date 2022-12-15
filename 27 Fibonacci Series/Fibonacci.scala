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

    def fiboDeepRecursion(val1 : Int, val2 : Int, n : Int){
        if(n < 1 ){
            println("\nEnding Now");
        }
        else{
            var tempVal : Int = val1 + val2;
            print("\t"+tempVal);
            fiboDeepRecursion(val2, tempVal, n-1);
        }
    }// deep recursion method ends here

    def fiboTailRecursion(val1 : Int, val2 : Int, n : Int){

        @tailrec
        def fiboTail(acc : String, val1 : Int, val2 : Int, n : Int)
        {
            if(n < 1 ){
                println("\n"+acc);
            }
            else{
                var tempVal : Int = val1 + val2;
                print("\t"+tempVal);
                fiboTail(acc,val2, tempVal, n-1);
            }
        }
        fiboTail("Ending Tail Recursion", val1, val2, n);

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
            println("\nFibonacci series upto "+inputN+" using Deep Recursion");
            fiboDeepRecursion(0, 1, inputN);
            println("\nFibonacci series upto "+inputN+" using Tail Recursion");
            fiboTailRecursion(0, 1, inputN);
        }

        println();
    }
}