public class OrderManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите заказ:");
        Order order = new Order();
        ConsoleInput input = new ConsoleInput();
        input.inputData(order, scanner);
        JsonExporter exporter = new JsonExporter();
        exporter.exportOrder(order);
        scanner.close();

        // Создаем вакансию и отправляем ее
        Vacancy vacancy = new Vacancy("Software Engineer", "OpenAI");
        vacancy.sendVacancy();
    }
}

class Order {
    private String clientName;
    private String product;
    private int quantity;
    private int price;

    // Конструктор, геттеры и сеттеры

    public void inputFromConsole(Scanner scanner) {
        setClientName(prompt("Client name: ", scanner));
        setProduct(prompt("Product: ", scanner));
        setQuantity(Integer.parseInt(prompt("Quantity: ", scanner)));
        setPrice(Integer.parseInt(prompt("Price: ", scanner)));
    }

    private String prompt(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
