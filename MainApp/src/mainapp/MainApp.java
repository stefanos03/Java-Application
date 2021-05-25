/*
 * MainApp.java is main test application
 * Stefanos Chatzileftheris
 */
package mainapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainApp {

    public static void main(String[] args) {
               Customer customer;
        Watch w;
        ArrayList<Watch> watches;

        String name = JOptionPane.showInputDialog("Enter Customer Name");
        customer = new Customer(name);
        watches = new ArrayList();
        JOptionPane.showMessageDialog(null, "Name customer details\n"
                + customer.toString());

        char input = '0';
        String message = "Manage watches fro customer: " + customer.getName()
                + "\n\nPlease select an option [1,2,3,4,5 or 0]\n"
                + "[1] Add Quartz watch\n"
                + "[2] Add Mechanical watch\n"
                + "[3] Summarise the watches\n"
                + "[4] Add comment to watch\n"
                + "[5] Service a Watch\n"
                + "[0] Exit\n";
        do {
            input = JOptionPane.showInputDialog(message).charAt(0);

            switch (input) {
                case '1': {
                    String make = JOptionPane.showInputDialog("Enter Watch Make");
                    String battery = JOptionPane.showInputDialog("Enter Battery size");
                    w = new QuartzWatch(make, battery);
                    watches.add(w);
                    JOptionPane.showMessageDialog(null, "Watch added\n" + w.toString());
                    break;
                }
                case '2': {
                    String make = JOptionPane.showInputDialog("Enter Watch Make");
                    String type = JOptionPane.showInputDialog("Enter type\n" + "[0] AUTOMATIC \n[1]MANUAL");
                    if (type.equals("0")) {
                        w = new MechanicalWatch(make, MechanicalType.AUTOMATIC);
                    } else {
                        w = new MechanicalWatch(make, MechanicalType.MANUAL);
                    }

                    watches.add(w);
                    JOptionPane.showMessageDialog(null, "Watch added\n" + w.toString());
                    break;
                }
                case '3': {
                    String summary = "";
                    for (Watch watch : watches) {
                        summary += watch.toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, summary);

                    break;
                }
                case '4': {
                    String message2 = "Choose watch from list";
                    message2 += "Enter number 0 to" + (watches.size() - 1);
                    for (int i = 0; i < watches.size(); i++) {
                        message2 += "[" + i + "]" + watches.get(i).getMake();
                    }
                    int choice = Integer.parseInt(JOptionPane.showInputDialog(message2));
                    w = watches.get(choice);
                    String comment = JOptionPane.showInputDialog(
                            "Enter comment for" + w.getMake());
                    w.addComment(comment);
                    JOptionPane.showMessageDialog(null, w.toString());
                    break;
                }
                case '5': {
                    String message2 = "Choose watch from list";
                    message2 += "Enter number 0 to" + (watches.size() - 1);
                    for (int i = 0; i < watches.size(); i++) {
                        message2 += "[" + i + "]" + watches.get(i).getMake();
                    }
                    int choice = Integer.parseInt(JOptionPane.showInputDialog(message2));
                    w = watches.get(choice);
                    w.service();
                    JOptionPane.showMessageDialog(null, w.toString());
                    break;
                }

            }

        } while (input != '0');
        JOptionPane.showMessageDialog(null, "Thanks for using the system Mr/Ms: " + customer.getName() + ".Goodbye");
    }
    }


