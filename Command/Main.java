interface Command {
    void execute();
}

class Button {
    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }

    public String getLabel() {
        return label;
    }
}

class CustomerService {
    public void addCustomer() {
        System.out.println("Add customer");
    }
}

class AddCustomerCommand implements Command {
    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}

public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Command command = new AddCustomerCommand(service);
        Button button = new Button(command);
        button.click();
    }
}