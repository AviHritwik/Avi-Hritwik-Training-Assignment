public class Customer {
    private int customerId;
    private String customerName;
    private String customerContact;

    public Customer() {
    }

    private Address customerAddress;


    public Customer(int customerId, String customerName, String customerContact,
                    Address customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerAddress = customerAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{\n" +
                "customerId=" + customerId +
                ", \ncustomerName='" + customerName + '\'' +
                ", \ncustomerContact='" + customerContact + '\'' +
                ", \ncustomerAddress=" + customerAddress +
                '}';
    }

}
