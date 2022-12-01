object Variable{
    def main(args: Array[String]){
        var mark1 : String = "About Roshan";
        println(mark1);
        mark1 = "Roshan is a cool guy";
        println(mark1);
        /*in the above variable mark1, the value can be changed bcoz it 
        *is declared using 'var' keyword
        * . It is mutable variable 
        */

        val mark2 : String = "Qualification";
        println(mark2);
        //mark2 = "None";    this line will give error: reassignment to val
        println(mark2);
        /* in this varibale declaration mark2,
        * the value cannot be changed because it is declared using 'val' keyword
        * it is immutable variable */
    }
}