object IfElse{
    def main(ar : Array[String]){
        var a : Int = 23;
        var b : Int = -2;
        var c : Double = a/b;

        if(c == 0){
            println("zero : "+c);
        }
        else if(c>0){
            println("Greater than zero : "+c);
        }
        else{
            println("Less than zero : "+c);
        }
    }
}