object Loops{
    def main(ar : Array[String]){

        var index : Int = 1;

        println("Starting While Loop");
        while(index<10){
            println("While Loop index = \t"+index);
            // index++; this operator is not working
            index = index +1;
            println("Incremented by 1");
        }
        println("While Loop Ended,\n index value = \t"+index);

        ////////////////////////////////////////////////////////////////////////

        println("\n\n Starting for loop");
        for(index2 <- 0 to 10){
            println("For Loop index2 value = \t"+index2);
        }
        println("For Loop Ended");
    }
}