/**
 * Created by Alex on 03/12/2016.
 */
Integer x=10
Integer cont=0
//x.times { println(++cont)}

def n1 = new Book("H1",10)
def n2 = new Book("H2",12)
def books = [n1,n2]

def b1 = [nome: "h1", ser: 1] //map
def b2 = [nome: "h2", ser: 1]
def bs = [b1,b2] //list list = [1,2,3]
for (int i = 0; i < bs.size() ; i++) {
    for ( e in bs[i] ) {
        print "${e.key}=${e.value} "
    }
    println()
}

List<Integer> list = new ArrayList<Integer>();
list.add(1)
list.add(2)
for (String item : list) {
    System.out.println(item)
}