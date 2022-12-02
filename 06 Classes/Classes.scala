import java.io._;

class Point(val xc : Int, val xy : Int){
    var x : Int = xc;
    var y : Int = xy;

        println("Initialized value of x = "+x);
        println("Initialized value of y = "+y);

    def move(dx : Int, dy : Int){
        x = x + dx;
        y = y + dy;
        println("Point x location = "+x);
        println("Point y location = "+y);
    }
}

object classes{
    def main(ar : Array[String]){
        val pt = new Point(10, 10);
        var inputA : Int = 0;
        var inputB : Int = 0;
        print("Enter Input A :\t");
        inputA = (scala.io.StdIn.readLine()).toInt;
        print("Enter Input B :\t");
        inputB = (scala.io.StdIn.readLine()).toInt;

        pt.move(inputA, inputB);
    }
}