/**
 * Created by Alex on 03/12/2016.
 */
class Main {
    static void main(args) {
        List books = new ArrayList()
        Book b1 = new  Book("H1","1")
        Book b2 = new  Book("H2","1")
        Book b3 = new  Book("H3","1")
        books.push(b1)
        books.push(b2)
        books.push(b3)
        books.push(new  Book("H1","2"))
        books.push(new  Book("H2","2"))
        books.push(new  Book("H1","2"))

        def shopping = new Books(books)
        //shopping.printBooks()
        println(shopping.finalPrice())
        }
}
