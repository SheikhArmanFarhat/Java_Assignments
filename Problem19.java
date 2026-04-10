class Problem19 {

    String title;
    String author;
    double price;

    Problem19(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Problem19[] books = new Problem19[3];

        books[0] = new Problem19("Java Basics", "James", 500);
        books[1] = new Problem19("Python Guide", "Guido", 450);
        books[2] = new Problem19("Data Structures", "Mark", 600);

        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}
