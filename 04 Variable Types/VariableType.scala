object VariableType{
    def main(args : Array[String]){
        var mark1 : Int;
        var mark2 : String;
        println("default value in mark1 type Int is = "+mark1);
        println("default value in mark2 type String is = "+mark2);
        /*
        *If we try to print the above two variables without initializing
        *it gives error as 'variables need to be initialized'
        */
        mark1 = 12;
        mark2 = "okay, got it";
        println("value of mark1 = "+mark1);
        println("value of mark2 = "+mark2);
        //the above satement is not working
        //error: only classes can have declared but undefined members
    }
}