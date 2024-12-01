import javax.swing.*;
import java.awt.*;

public class FormAplikasi extends JFrame {
    private CardLayout layoutHalaman;
    private JPanel panelUtama;

    public FormAplikasi() {
        setTitle("Masuk dan Daftar");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        layoutHalaman = new CardLayout();
        panelUtama = new JPanel(layoutHalaman);

        panelUtama.add(buatPanelMasuk(), "Masuk");
        panelUtama.add(buatPanelDaftar(), "Daftar");

        add(panelUtama);
        layoutHalaman.show(panelUtama, "Masuk");
    }

    private JPanel buatPanelMasuk() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel labelJudul = new JLabel("MASUK");
        labelJudul.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(labelJudul, gbc);

        JLabel labelEmail = new JLabel("Email");
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        panel.add(labelEmail, gbc);

        JTextField fieldEmail = new JTextField(20);
        gbc.gridx = 1;
        panel.add(fieldEmail, gbc);

        JLabel labelKataSandi = new JLabel("Kata Sandi");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(labelKataSandi, gbc);

        JPasswordField fieldKataSandi = new JPasswordField(20);
        gbc.gridx = 1;
        panel.add(fieldKataSandi, gbc);

        JButton tombolMasuk = new JButton("Masuk");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(tombolMasuk, gbc);

        JButton tombolKeDaftar = new JButton("Daftar");
        tombolKeDaftar.addActionListener(e -> layoutHalaman.show(panelUtama, "Daftar"));
        gbc.gridy = 4;
        panel.add(tombolKeDaftar, gbc);

        return panel;
    }

    private JPanel buatPanelDaftar() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel labelJudul = new JLabel("DAFTAR");
        labelJudul.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(labelJudul, gbc);

        JLabel labelNama = new JLabel("Nama");
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        panel.add(labelNama, gbc);

        JTextField fieldNama = new JTextField(20);
        gbc.gridx = 1;
        panel.add(fieldNama, gbc);

        JLabel labelEmail = new JLabel("Email");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(labelEmail, gbc);

        JTextField fieldEmail = new JTextField(20);
        gbc.gridx = 1;
        panel.add(fieldEmail, gbc);

        JLabel labelKataSandi = new JLabel("Kata Sandi");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(labelKataSandi, gbc);

        JPasswordField fieldKataSandi = new JPasswordField(20);
        gbc.gridx = 1;
        panel.add(fieldKataSandi, gbc);

        JButton tombolDaftar = new JButton("Daftar");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(tombolDaftar, gbc);

        JButton tombolKeMasuk = new JButton("Masuk");
        tombolKeMasuk.addActionListener(e -> layoutHalaman.show(panelUtama, "Masuk"));
        gbc.gridy = 5;
        panel.add(tombolKeMasuk, gbc);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormAplikasi aplikasi = new FormAplikasi();
            aplikasi.setVisible(true);
        });
    }
}
   