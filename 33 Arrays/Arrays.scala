import java.io._;

object Arrays{
    var z : Array[String] = new Array[String] (5);

    def main(arg : Array[String]){
        var i : Int = 0;
        print("\nEnter Name of 5 places");
        while(i<5){
            print("\n"+i+" Enter item :\t");
            z(i) = scala.io.StdIn.readLine();
            i = i+1;
        }
        print("\nPrinting all items : \t");
        var n : Int = 0;
        while(n<5){
            print("\n "+n+" "+z(n));
            n = n+1;
        }
        println("\n\n");
    }
}