import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 1. TOP-LEVEL CONTAINER: JFrame
public class KalkulatorGUI extends JFrame {

    public KalkulatorGUI() {
        super("Penjumlahan - Nabil Naufal Anugrah (F1D02510127)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 250);
        setLocationRelativeTo(null);

        // 4. LAYOUT #1: BorderLayout (frame)
        setLayout(new BorderLayout(10, 10));

        // 2. INTERMEDIATE CONTAINER: JPanel
        // 4. LAYOUT #2: GridLayout (panel form)
        JPanel panelForm = new JPanel(new GridLayout(3, 2, 10, 10));
        panelForm.setBorder(BorderFactory.createEmptyBorder(20, 30, 10, 30));
        JPanel panelTombol = new JPanel(); // default FlowLayout

        // 3. ATOMIC COMPONENT: JLabel, JTextField, JButton
        JTextField txtAngka1 = new JTextField();
        JTextField txtAngka2 = new JTextField();
        JLabel lblHasil = new JLabel("-");
        JButton btnHitung = new JButton("Hitung");

        panelForm.add(new JLabel("Angka 1:"));
        panelForm.add(txtAngka1);
        panelForm.add(new JLabel("Angka 2:"));
        panelForm.add(txtAngka2);
        panelForm.add(new JLabel("Hasil:"));
        panelForm.add(lblHasil);
        panelTombol.add(btnHitung);

        // 5. EVENT LISTENER (a): ActionListener (Interface)
        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtAngka1.getText().trim());
                    int b = Integer.parseInt(txtAngka2.getText().trim());
                    lblHasil.setText(String.valueOf(a + b));
                } catch (NumberFormatException ex) {
                    lblHasil.setText("Input harus angka!");
                }
            }
        });

        // 5. EVENT LISTENER (b): MouseAdapter (Adapter Class)
        btnHitung.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnHitung.setBackground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnHitung.setBackground(null);
            }
        });

        add(panelForm, BorderLayout.CENTER);
        add(panelTombol, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KalkulatorGUI().setVisible(true));
    }
}