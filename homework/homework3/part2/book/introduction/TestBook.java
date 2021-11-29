package homework.homework3.part2.book.introduction;

public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("pham viet long", "long@longmail.com", 'm');
        System.out.println(author);

        Book dummyBook = new Book("long book", author, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("author is: " + dummyBook.getAuthor());

        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
        System.out.println("Author's name is: " + anotherBook.getAuthorName());
        System.out.println("Author's mail is: " + anotherBook.getAuthorEmail());
        System.out.println("Author's gender is: " + anotherBook.getAuthorGender());
    }
}
