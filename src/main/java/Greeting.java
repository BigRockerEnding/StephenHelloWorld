
import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;

import java.util.Date;

/**
 * Created by BigRockerEnding on 11/13/16.
 */
@Entity
public class Greeting {
    @Parent Key<Guestbook> theBook;
    @Id public long id;
    public String author_email;
    public String author_id;
    public String content;
    @Index public Date date;

    public Greeting() {
        this.date = new Date();
    }

    public Greeting(String book, String content) {
        this();
        this.content = content;
        if (book != null) {
            theBook = Key.create(Guestbook.class, book);
        } else {
            theBook = Key.create(Guestbook.class, "default");
        }
    }

    public Greeting(String book, String content, String email, String id) {
        this(book, content);
        this.author_email = email;
        this.author_id = id;
    }
}
