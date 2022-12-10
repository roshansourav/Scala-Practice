object SimpleList{
    def main(ar : Array[String]){
        val shoes : List[String] = List("Adidas", "AjitDas", "Abibas", "Abidas");
        print("\nComplete List = \t"+shoes);
        print("\nHead of the List = \t"+shoes.head);
        print("\nTail of the List = \t"+shoes.tail);
        print("\nCheck if List is empty = \t"+shoes.isEmpty);
        println();
    }
}