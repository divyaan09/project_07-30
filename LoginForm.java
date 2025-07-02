
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {

    // GUI Components
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginForm() {
        setTitle("Login Form");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen

        // Create UI
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Username
        panel.add(new JLabel("Username:"));
        userField = new JTextField();
        panel.add(userField);

        // Password
        panel.add(new JLabel("Password:"));
        passField = new JPasswordField();
        panel.add(passField);

        // Message Label
        messageLabel = new JLabel("");
        messageLabel.setForeground(Color.RED);
        panel.add(messageLabel);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userField.getText().trim();
        String password = new String(passField.getPassword());

        // Validation
        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Fields cannot be empty!");
        } else if (!username.matches("[a-zA-Z0-9_]+")) {
            messageLabel.setText("Invalid username!");
        } else if (password.length() < 6) {
            messageLabel.setText("Password must be at least 6 characters!");
        } else {
            messageLabel.setForeground(Color.GREEN);
            messageLabel.setText("Login successful!");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
