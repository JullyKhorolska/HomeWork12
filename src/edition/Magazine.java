package edition;
import printable.Printable;

import java.util.List;

public class Magazine implements Printable {
    public String title;
    public Magazine(String title){
        this.title = title;
    }
    @Override
    public String print() {
        return ("The title of this magazine is " + this.title);
    }

    @Override
    public String toString(){
        return ("This is magazine: " + this.title);
    }

}

