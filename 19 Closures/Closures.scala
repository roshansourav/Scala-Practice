import java.io._;

object Closures{

    var gst = (n : Double) => n * 0.18

    def main(ar : Array[String]){
        var input : Double = 0;
        print("\nEnter the price to calculate gst : \t");
        input = (scala.io.StdIn.readLine()).toDouble;
        println("\nGST 18% of "+input+" = \t"+gst(input));
    }
}