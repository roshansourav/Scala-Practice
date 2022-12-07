// 05 Given a number, check whether it is palindrome or not.

import java.io._;

object Palindrome{

    def checkPalindrome(userNumber : Int) : String ={
        var tempNumber : Int = userNumber;
        var newNumber : Int = 0;
        var condition : Boolean = true;
        while(condition){
            newNumber = (newNumber * 10) + tempNumber%10;
            tempNumber = tempNumber / 10;
            if(tempNumber == 0) 
                condition = false; 
        }

        if(userNumber == newNumber)
            return "Palindrome Number ";
        else    
            return "Not palindrome";

    }

    def main(ar : Array[String]){
        var inputNum : Int = 0;
        print("\n\nEnter Number : \t");
        inputNum = (scala.io.StdIn.readLine()).toInt;
        if(inputNum <1)
            println("\nPlease enter number greater than zero");
        else
            println("\nGiven number "+inputNum+" is "+checkPalindrome(inputNum));
    }


}