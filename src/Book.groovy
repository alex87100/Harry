/**
 * Created by Alex on 03/12/2016.
 */
class Book {
    String name
    String serie

    Book (name,serie){
        this.name = name
        this.serie = serie
    }

    void printBook(){
       println("Book:" + getName()+ " Serie:" + getSerie())
    }
}
