package academy.section02_structure;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class GUIMkDir extends JFrame {

    private GUIMkDir() {
        setTitle("mkdir");
        setLayout(new FlowLayout());
        setSize(400, 200);
        JTextField tfName = new JTextField();
        tfName.setPreferredSize(new Dimension(200, 30));
        add(tfName);
        JButton btMkDir = new JButton("Make directory");
        btMkDir.addActionListener(e -> new File(tfName.getText()).mkdir());
        add(btMkDir);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUIMkDir().setVisible(true));
    }
}
