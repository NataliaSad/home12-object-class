public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author( "Александр", " Пушкин ");
        Author tolstoy2 = new Author( " Алексей ", " Толстой1 ");
        Book dubrovskii = new Book(" Дубровский", 1833, pushkin);
        Book aelita = new Book( " Аэлита", 1923, tolstoy2);

        System.out.println(tolstoy2.equals(tolstoy2));
        System.out.println("Пушкин");
        System.out.println("dubrovskii");
        System.out.println("aelita");
        System.out.println(dubrovskii.hashCode());
        System.out.println(aelita.hashCode());
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
