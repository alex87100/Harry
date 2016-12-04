/**
 * Created by Alex on 03/12/2016.
 */
class Books {
    List books = new ArrayList()

    Books (books){
        this.books=books;
    }

    void printBooks() {
        books.each { println "Book:" + it.getName() + " Serie:" + it.getSerie() }
    }

    double finalPrice() {
        double result = 0
        double discount = 0

        for(int i = 0; i < books.size(); i++) {
            result+=7
        }

        ArrayList<Integer> series = new ArrayList<String>();
        for(int i = 0; i < books.size(); i++) {
            series.add(books[i].getSerie())
        }
        series.unique()

        for(int i = 0; i < series.size(); i++) {
            ArrayList<String> names = new ArrayList<String>();
            String curr = series[i]
            println(curr)
            for(int j = 0; j < books.size(); j++) {
                if(curr == books[j].getSerie()) {
                    //println(books[j].getSerie() + books[j].getName())
                    names.add(books[j].getName())
                }
            }
            names.unique()
            for(int k = 0; k < names.size(); k++) {
                println(names[k])
            }
            if(names.size()>=3) {
                discount = ((10 * result) / 100)
            }
        }
        return result-discount;
    }
}