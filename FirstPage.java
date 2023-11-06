import javax.swing.*;

public class FirstPage {
    public static void main(String[] args) {
        final String text = ("firstPage");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                final LogSignPage window = new LogSignPage(text);
                window.setVisible(true);
            }
        });
    }
}
