package homework.homework3.part2.book.introduction;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("pham viet long", "long@longmail.com", 'm');

        System.out.println(author);
        author.setEmail("asdasda@gmail.com");
        System.out.println("name is: " + author.getName());
        System.out.println("mail is: " + author.getEmail());
        System.out.println("gender is: " + author.getGender());
    }
}
