package edition;

import printable.Printable;
import java.util.*;

public class Book implements Printable {
    public String title;
    public Book(String title){
        this.title = title;
    }
    @Override
    public String print() {
        return ("The title of this book is " + this.title);
    }
    @Override
    public String toString(){
       return ("This is book: " + this.title);
    }
}
//        for(Printable edition : printable){
//            if(edition instanceof Book){
//                System.out.println(((Book) edition).title);
//            }
//        }