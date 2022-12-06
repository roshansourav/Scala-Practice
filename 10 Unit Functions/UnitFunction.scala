object UnitFunction{

    def add(inputA : Int, inputB : Int){
        var sum : Int = inputA + inputB;
        println("Sum of "+inputA+" and "+inputB+" is = \t"+sum);
    }

    def main(ar : Array[String]){
        add(4, 5);
    }
}