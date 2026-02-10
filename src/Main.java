public class Main {
    public static void main(String[] args) {
        Book book = new Book("Bullet Train", "Kotaro Isaka", 850.0, 10);
        book.sellCopy();
        book.orderCopies(5);

        System.out.println();

        Magazine magazine = new Magazine("Vogue", 300.0, 20, 10, "October 2025");
        magazine.sellCopy();
        magazine.adjustQty(15);
        magazine.recvNewIssue("November 2025");
    }
}

// Общий класс
class Publication {
    String title;
    double price;
    int copies;

    Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    void sellCopy() {
        if (copies > 0) {
            copies--;
            System.out.println("Sold 1 copy of " + title);
        } else {
            System.out.println("No copies left of " + title);
        }
    }
}

// Книга
class Book extends Publication {
    String author;

    Book(String title, String author, double price, int copies) {
        super(title, price, copies);
        this.author = author;
    }

    void orderCopies(int quantity) {
        copies += quantity;
        System.out.println("Ordered " + quantity + " new copies of book: " + title);
    }
}

// Журнал
class Magazine extends Publication {
    int orderQty;
    String currIssue;

    Magazine(String title, double price, int copies, int orderQty, String currIssue) {
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currIssue = currIssue;
    }

    void adjustQty(int newQty) {
        orderQty = newQty;
        System.out.println("Adjusted order quantity to: " + orderQty);
    }

    void recvNewIssue(String newIssue) {
        currIssue = newIssue;
        copies += orderQty;
        System.out.println("Received new issue: " + currIssue);
        System.out.println("Copies after receiving: " + copies);
    }
}