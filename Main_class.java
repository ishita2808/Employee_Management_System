package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {

    Main_class() {

        // Adding background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 500, Image.SCALE_DEFAULT); // Adjusted height to position buttons below the hand
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0, 0, 1120, 500); // Set the bounds of the image
        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(235, 30, 800, 60);
        heading.setFont(new Font("Serif", Font.BOLD, 50));
        heading.setForeground(Color.blue);
        img.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(300, 520, 150, 40); // Positioned below the hand image
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setFocusPainted(false);
        add.setBorderPainted(false); // Remove outer border
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);

            }
        });
        add(add); // Add directly to the frame

        JButton view = new JButton("View Employee");
        view.setBounds(500, 520, 150, 40); // Positioned next to "Add Employee" button
        view.setForeground(Color.WHITE);
        view.setBackground(Color.BLACK);
        view.setFocusPainted(false);
        view.setBorderPainted(false); // Remove outer border
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View_Employee();
                setVisible(false);

            }
        });
        add(view); // Add directly to the frame


        JButton rem = new JButton("Remove Employee");
        rem.setBounds(700, 520, 150, 40); // Positioned next to "View Employee" button
        rem.setForeground(Color.WHITE);
        rem.setBackground(Color.BLACK);
        rem.setFocusPainted(false);
        rem.setBorderPainted(false); // Remove outer border
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();

            }
        });
        add(rem); // Add directly to the frame

        // Frame properties
        setSize(1120, 630);
        setLocation(250, 100);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main_class();
    }
}
