import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        Assertions.assertEquals(phoneBook.add("123", "meme"), 1);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("123", "meme");
        Assertions.assertEquals(phoneBook.findByNumber("123"), "meme");
    }
}
