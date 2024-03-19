import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to BrainBurst");
        heading.setBounds(70, 15, 650, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 32));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 70, 670, 400);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 18));
        rules.setText(
                "<html>"+
                        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>"
        );

        add(rules);

        back = new JButton("Home");
        back.setBounds(100, 500, 100, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.white);
        back.addActionListener(this); // Set action listener to this (Rules class)
        add(back);

        start = new JButton("Start");
        start.setBounds(580, 500, 100, 25);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.white);
        start.addActionListener(this); // Set action listener to this (Rules class)
        add(start);

        setSize(800, 600);
        setLocation(250, 60);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            // Handle start button action here
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("Anonymous User");
    }
}
