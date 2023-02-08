public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author( "Александр", " Пушкин ");
        Author tolstoy = new Author( " Алексей ", " Толстой ");
        Book dubrovskii = new Book(" Дубровский", 1833, pushkin);
        Book aelita = new Book( " Аэлита", 1923, tolstoy);

        print(dubrovskii);
        print(aelita);
        dubrovskii.printInfo();
        aelita.printInfo();
        dubrovskii.setPublishingYear(1865);
        dubrovskii.printInfo();
    }
    private static void print(Book book) {
        System.out.println("Название книги:" + book.getTitle() + " год издания :" + book.getPublishingYear() +
                " автор : " + book.getAuthor().getName() + " " + book.getAuthor().getSurname());

    }

}
