/*
 * Customer.java represents customers of wtach shop
 * Stefanos Chatzileftheris
 */
package mainapp;

//Stefanos Chatzileftheris Id:1909248
//Customer class for
//Data 23/05/21
public class Customer {

    //properties of Customer object
    private String name;
    private int id;

    private static int nextId;

    public Customer(String n) {
        this.name = n;
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer name:" + name + "  , ID:  " + id;
    }

    public static int getNextid() {
        return Customer.nextId;
    }
    //testing mode

    public static void main(String[] args) {
        Customer c1 = new Customer("Scarlett");
        System.out.println(c1.toString());

        Customer c2 = new Customer("Stefanos");
        System.out.println(c2.toString());
    }

}