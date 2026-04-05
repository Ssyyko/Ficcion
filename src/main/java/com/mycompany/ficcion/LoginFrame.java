package com.mycompany.ficcion;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Ventana de inicio de sesion.
 */
public class LoginFrame extends JFrame {

    /**
     * Crea la ventana de login.
     *
     * @param series lista de series
     * @param peliculas lista de peliculas
     */
    public LoginFrame(List<Serie> series, List<Pelicula> peliculas) {
        setTitle("Login");
        setSize(380, 220);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        JTextField txtUsuario = new JTextField(15);
        JPasswordField txtContrasena = new JPasswordField(15);
        BotonPersonalizado btnEntrar = new BotonPersonalizado("Entrar");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Usuario"), gbc);
        gbc.gridx = 1;
        add(txtUsuario, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Contrasena"), gbc);
        gbc.gridx = 1;
        add(txtContrasena, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        add(btnEntrar, gbc);

        btnEntrar.addActionListener(e -> {
            String usuario = txtUsuario.getText().trim();
            String clave = new String(txtContrasena.getPassword());
            if (usuario.equals("admin") && clave.equals("1234")) {
                setVisible(false);
                new MenuFrame(series, peliculas).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Datos incorrectos");
            }
        });
    }
}
