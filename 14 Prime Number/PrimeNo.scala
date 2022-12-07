// 04 Given a number, check whether it is a prime or not.

import java.io._;

object PrimeNo{
    def checkPrime(num : Int) : String = {
        var count : Int = 0;
        for(index <- 1 to num){
            if(num%index == 0)
                count = count + 1;
        }

        if(count > 2){
            return "Not Prime";
        }
        else 
            return "Prime Number";
    }

    def main(ar : Array[String]){
        var number : Int = 0;
        print("Enter number :\t");
        number = (scala.io.StdIn.readLine()).toInt;
        if(number < 2)
            println("\nPlease enter number greater than 1");
        else
            println("Given number "+number+" is "+checkPrime(number));

    }
}