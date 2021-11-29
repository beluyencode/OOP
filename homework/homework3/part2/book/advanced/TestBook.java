package homework.homework3.part2.book.advanced;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("pham viet long", "long@long.com", 'm');
        authors[1] = new Author("long pham viet", "long@somewhere.com", 'm');

        Book javacode = new Book("java code", authors, 19.95, 99);
        System.out.println(javacode);

    }
}
