import java.io._;

object BitwiseOperation{
    def main(args: Array[String]) {
        var inputA = 0;
        var inputB = 0;
        var carry = 0;

        print("\nEnter inputA : \t");
        inputA = (scala.io.StdIn.readLine()).toInt

        print("\nEnter inputB : \t");
        inputB = (scala.io.StdIn.readLine()).toInt
        
        while(inputB != 0){
            carry = inputA & inputB
            inputA = inputA ^ inputB
            inputB = carry << 1
        }
        print("\nSum = "+inputA)
   }
}