/**Create a calculator which accepts two double values and can do -
 *    (i) Basic - +, -, division
 *    (ii) Delta value and then find the absolute value
 *    (iii) Divide x/y then return the integer part of the division
 *    (iv) Return remainder of x / y
 */

 import java.io._;

 object Calculator{

    def addition(a: Double, b : Double) : Double = {
        return a+b;
    }

    def subtraction(a : Double, b : Double) : Double = {
        return a-b;
    }

    def multiplication(a : Double, b : Double) : Double = {
        return a*b;
    }

    def division(a : Double, b : Double) : Double = {
        return a/b;
    }

    def delta(a : Double, b : Double) : Double = {
        return b/a;
    } 

    def remainder(a : Double, b : Double) : Int = {
        return (a%b).toInt;
    }

    def main(ar : Array[String]){
        var inputA : Double = 0;
        var inputB : Double = 0;
        var choice : Int = 0;

        println();
        println("\t\t\tWelcome to Magic Calculator");
        println("\t\t\t *************************\n");

        print("\nEnter inputA : \t");
        inputA = (scala.io.StdIn.readLine()).toDouble;
        print("\nEnter inputB : \t");
        inputB = (scala.io.StdIn.readLine()).toDouble;

        println("\n *******************************************\n");
        println("1 for Addition\n2 for Subtraction\n3 for multiplication \n4 for division\n5 for Delta and Absolute Value\n6 for Division's remainder");

        print("\nEnter choice :\t");
        choice = (scala.io.StdIn.readLine()).toInt;
        println();

        if(choice == 1)
            println("\nSum of "+inputA+" and "+inputB+" is = \t"+addition(inputA, inputB));

        else if(choice == 2)
            println("Subtraction of "+inputA+" and "+inputB+" is = \t"+subtraction(inputA, inputB));

        else if(choice == 3)
            println("Multiplication of "+inputA+" and "+inputB+" is = \t"+multiplication(inputA, inputB));

        else if(choice == 4){
            var result : Double = 0;
            result = division(inputA, inputB);
            println("Division of "+inputA+" and "+inputB+" is = \t"+result);
            println("Integer part of Division will be \t"+result.toInt);
        }

        else if(choice == 5){
            var result : Double = 0;
            result = delta(inputA, inputB);
            println("Delta value of "+inputA+" and "+inputB+" is = \t"+result);
            println("Absolute value will be = \t"+result.abs);
        }
        else if(choice == 6){
            println("Remainder of "+inputA+" / "+inputB+" is = \t"+remainder(inputA, inputB));
        }


        else 
            println("Wrong Choice Entered");

        println("\n***** Ending Now ******");

    }

 }