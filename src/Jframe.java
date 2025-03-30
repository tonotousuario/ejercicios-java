import javax.swing.*;

public class Jframe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Topicos avanzados de programación");
        JLabel label = new JLabel("Amarilo amarillo platano");
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
