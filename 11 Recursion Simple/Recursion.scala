object Recursion{
    def factorial(n : Int) : Int = {
        if(n == 1)
            1;
            // return 1;     // This return statement will also work. In scala it is optional, we can ignore it.
        else
            return n * factorial(n-1);
            // return n * factorial(n-1); //this will also work
    }

    def main(ar : Array[String]){
        println("calling factorial function with parameter 5 \n " + factorial(5));
    }
}