import java.io._;

object Srings{
    def main(ar : Array[String]){
        var inputA : String = "";
        print("\nEnter a String : \t");
        inputA = scala.io.StdIn.readLine();
        println("char at 1 = "+inputA.charAt(1));
        var inputB :String = "";
        print("\nEnter one more String to compare : \t");
        inputB = scala.io.StdIn.readLine();
        print("\ncomparing String1 and String2 = \t"+inputA.compareTo(inputB));
        print("\nConcatenation of String1 and String2 = \t"+inputA.concat(inputB));
        print("\n Length of "+inputA+" = \t"+inputA.length);
        print("\n Length of "+inputB+" = \t"+inputB.length);
        println();

    }
}