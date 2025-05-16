public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Александр", "Островский");
        Author author2 = new Author("Иван", "Гончаров");

        Book book1 = new Book("Гроза", author1, 1860);
        Book book2 = new Book("Обломов", author2, 1859);

        book1.setPublicationYear(1861);

        System.out.println(book1);
        System.out.println(book2);


    }
}