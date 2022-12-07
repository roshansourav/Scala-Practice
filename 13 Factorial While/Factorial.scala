// 02 Find factorial of a number using while loop.

object Factorial{
    def Factorial(n : Int){
        var num : Int = n;
        var i : Int = num-1 ;
        while(i>0){
            num = num * i;
            i = i-1;
            
        }
        println("Completed While Loop\n");
        println("Factorial of "+n+" is = \t"+num);
    }
    def main(ar : Array[String]){
        println("Calling Factorial with passing 5");
        Factorial(5);
    }
}