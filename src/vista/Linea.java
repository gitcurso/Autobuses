package vista;

import static javax.swing.JOptionPane.showMessageDialog;

import controlador.Controlador;
import modelo.excepciones.CodigoLineaInvalida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by poo2 on 25/05/2016.
 */
public class Linea extends JFrame implements ActionListener {
  private JPanel linea;
  private JTextField l;
  private JButton darDeAltaLaButton;
  private JLabel lineatext;
  private Controlador ctrl;

  public Linea(String titulo, Controlador c) {
    super(titulo);

    ctrl = c;

    setContentPane(linea);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    pack();
    setLocationRelativeTo(null);

    darDeAltaLaButton.addActionListener(this);
    setVisible(true);
  }

  public static void main(String[] args) {
    Linea frame = new Linea("Linea", new Controlador());
  }


  @Override
  public void actionPerformed(ActionEvent e) {
    try {
      ctrl.addLinea(Integer.parseInt(l.getText()));
      showMessageDialog(this, "Datos introducidos");
    } catch (NumberFormatException error) {
      showMessageDialog(this, "El código de línea tiene que ser un número");
    } catch (CodigoLineaInvalida error) {
      showMessageDialog(this, "El código de la línea es inválido");
    } catch (Exception error) {
      showMessageDialog(this, "Error al introducir datos");
    }
  }

  {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
    $$$setupUI$$$();
  }

  /**
   * Method generated by IntelliJ IDEA GUI Designer
   * >>> IMPORTANT!! <<<
   * DO NOT edit this method OR call it in your code!
   *
   * @noinspection ALL
   */
  private void $$$setupUI$$$() {
    linea = new JPanel();
    linea.setLayout(new GridBagLayout());
    lineatext = new JLabel();
    lineatext.setText("Número de línea:");
    GridBagConstraints gbc;
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.WEST;
    linea.add(lineatext, gbc);
    final JPanel spacer1 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 0;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    linea.add(spacer1, gbc);
    final JPanel spacer2 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.fill = GridBagConstraints.VERTICAL;
    linea.add(spacer2, gbc);
    l = new JTextField();
    gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipadx = 20;
    linea.add(l, gbc);
    darDeAltaLaButton = new JButton();
    darDeAltaLaButton.setText("Dar de alta la línea");
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    linea.add(darDeAltaLaButton, gbc);
  }

  /**
   * @noinspection ALL
   */
  public JComponent $$$getRootComponent$$$() {
    return linea;
  }
}
