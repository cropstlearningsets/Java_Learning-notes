package cheapter64;

public class Customer {
    String name;
    int age;
    boolean hasCard;
}

class CustomerBiz {
    Customer[] customers = new Customer[30];
    int index = 0;

    public static void main(String[] args) {
        CustomerBiz cuBiz = new CustomerBiz();
        Customer chen = new Customer();
        chen.name = "Jacky";
        chen.age = 30;
        chen.hasCard = true;
        cuBiz.addCustomer(chen);
        Customer liu = new Customer();
        liu.name = "James";
        liu.age = 19;
        liu.hasCard = true;
        cuBiz.addCustomer(liu);

        cuBiz.showCustomers();
    }

    public void addCustomer(Customer customer) {
        customers[index] = customer;
        index++;
    }

    public void showCustomers() {
        System.out.println("客户信息:");
        for (int i = 0; i < index; i++) {
            Customer customer = customers[i];
            System.out.println(customer.name + "\t" + customer.age + "\t" + customer.hasCard);
        }
    }
}
