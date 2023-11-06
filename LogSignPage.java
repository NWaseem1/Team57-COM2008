import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class LogSignPage extends JFrame {

    private JButton loginButton;
    private JButton signUpButton;

    public LogSignPage(String title) {

        super(title);

        // button creation
        JButton loginButton = new JButton("Login");
        JButton signUpButton = new JButton("Sign Up");
        loginButton.setPreferredSize(new Dimension(100, 30));
        signUpButton.setPreferredSize(new Dimension(100, 30));

        //Window creation where all the buttons will be 
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(loginButton);
        panel.add(signUpButton);

        // aligns the buttons to the x axis
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        signUpButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // lets you close window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);

        // 20% of screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (screenSize.width * 8 / 10);
        int height = (screenSize.height * 8 / 10);
        this.setSize(width,height);
        this.setLocationRelativeTo(null);
    }
}