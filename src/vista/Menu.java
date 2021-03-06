package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by poo2 on 25/05/2016.
 */
public class Menu extends JFrame implements ActionListener {
  private JPanel menu;
  private JButton altaDeLíneasButton;
  private JButton altaDeAutobusesButton;
  private JButton salirButton;
  private JButton guardarLíneasButton;
  private Controlador ctrl;

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
    menu = new JPanel();
    menu.setLayout(new GridBagLayout());
    altaDeAutobusesButton = new JButton();
    altaDeAutobusesButton.setText("Alta de autobuses");
    GridBagConstraints gbc;
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 4;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    menu.add(altaDeAutobusesButton, gbc);
    altaDeLíneasButton = new JButton();
    altaDeLíneasButton.setText("Alta de líneas");
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 2;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    menu.add(altaDeLíneasButton, gbc);
    salirButton = new JButton();
    salirButton.setText("Salir");
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 6;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    menu.add(salirButton, gbc);
    final JPanel spacer1 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 1;
    gbc.fill = GridBagConstraints.VERTICAL;
    gbc.ipady = 20;
    menu.add(spacer1, gbc);
    final JLabel label1 = new JLabel();
    label1.setHorizontalAlignment(11);
    label1.setHorizontalTextPosition(11);
    label1.setText("  MENU PRINCIPAL");
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 0;
    menu.add(label1, gbc);
    final JPanel spacer2 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    menu.add(spacer2, gbc);
    final JPanel spacer3 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 7;
    gbc.fill = GridBagConstraints.VERTICAL;
    menu.add(spacer3, gbc);
    final JPanel spacer4 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 2;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    menu.add(spacer4, gbc);
    final JPanel spacer5 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 3;
    gbc.fill = GridBagConstraints.VERTICAL;
    menu.add(spacer5, gbc);
    final JPanel spacer6 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 5;
    gbc.fill = GridBagConstraints.VERTICAL;
    menu.add(spacer6, gbc);
  }

  /**
   * @noinspection ALL
   */
  public JComponent $$$getRootComponent$$$() {
    return menu;
  }

  private class AccionLineaNueva implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      new Linea("Linea nueva", ctrl);
    }
  }

  private class AccionAutobusNuevo implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      new Autobus("Autobus nuevo", ctrl);
    }
  }

  public static void main(String[] args) {
    Menu m = new Menu("Menu");
  }

  public Menu(String titulo) {
    super(titulo);

    setContentPane(menu);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
    ctrl = new Controlador();

    salirButton.addActionListener(this);
    altaDeLíneasButton.addActionListener(new AccionLineaNueva());
    altaDeAutobusesButton.addActionListener(new AccionAutobusNuevo());
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    dispose();
  }

}
