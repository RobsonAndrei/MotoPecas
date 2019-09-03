package Janelas;

import Dominio.Estoque;
import Dominio.Peca;
import Janelas.JanelaPrincipal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class JanelaCadPecas extends JDialog {

  private final JPanel contentPanel = new JPanel();
  private JTextField textFieldNomePeca;
  private JTextField textFieldCodPeca;
  private JTextField textFieldDescricao;
  private JTextField textFieldValorCompra;
  private JTextField textFieldValorVenda;
  private JanelaPrincipal jp = new JanelaPrincipal();

  /** Launch the application. */
  public static void main(String[] args) {
    try {
      JanelaCadPecas dialog = new JanelaCadPecas();
      dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
      dialog.setVisible(true);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /** Create the dialog. */
  public JanelaCadPecas() {
    setTitle("Cadastro de Peças");
    setBounds(100, 100, 1094, 765);
    getContentPane().setLayout(new BorderLayout());
    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    getContentPane().add(contentPanel, BorderLayout.CENTER);
    contentPanel.setLayout(null);
    {
      JLabel label =
          new JLabel(new ImageIcon("/Users/robsonandrei/git/MotoPecas/src/perfil 02.png"));
      label.setBounds(48, 39, 181, 155);
      contentPanel.add(label);
    }
    {
      JLabel lblNewLabel = new JLabel("Insira os dados da peça");
      lblNewLabel.setForeground(new Color(128, 128, 128));
      lblNewLabel.setBounds(268, 39, 159, 16);
      contentPanel.add(lblNewLabel);
    }
    {
      JLabel lblNomeDaPea = new JLabel("Nome da peça:\n");
      lblNomeDaPea.setForeground(Color.GRAY);
      lblNomeDaPea.setBounds(268, 67, 104, 16);
      contentPanel.add(lblNomeDaPea);
    }
    {
      textFieldNomePeca = new JTextField();
      textFieldNomePeca.setBounds(268, 88, 512, 26);
      contentPanel.add(textFieldNomePeca);
      textFieldNomePeca.setColumns(10);
    }
    {
      JLabel lblCdigo = new JLabel("Código:");
      lblCdigo.setForeground(Color.GRAY);
      lblCdigo.setBounds(792, 67, 104, 16);
      contentPanel.add(lblCdigo);
    }
    {
      textFieldCodPeca = new JTextField();
      textFieldCodPeca.setColumns(10);
      textFieldCodPeca.setBounds(792, 88, 263, 26);
      contentPanel.add(textFieldCodPeca);
    }
    {
      JLabel lblDescrio = new JLabel("Descrição:");
      lblDescrio.setForeground(Color.GRAY);
      lblDescrio.setBounds(268, 126, 104, 16);
      contentPanel.add(lblDescrio);
    }
    {
      textFieldDescricao = new JTextField();
      textFieldDescricao.setColumns(10);
      textFieldDescricao.setBounds(268, 154, 512, 90);
      contentPanel.add(textFieldDescricao);
    }
    {
      JLabel lblValorDeCompra = new JLabel("Valor de compra:");
      lblValorDeCompra.setForeground(Color.GRAY);
      lblValorDeCompra.setBounds(792, 136, 127, 16);
      contentPanel.add(lblValorDeCompra);
    }
    {
      textFieldValorCompra = new JTextField();
      textFieldValorCompra.setColumns(10);
      textFieldValorCompra.setBounds(792, 153, 263, 26);
      contentPanel.add(textFieldValorCompra);
    }

    JLabel lblValorDeVenda = new JLabel("Valor de venda:");
    lblValorDeVenda.setForeground(Color.GRAY);
    lblValorDeVenda.setBounds(792, 201, 127, 16);
    contentPanel.add(lblValorDeVenda);

    textFieldValorVenda = new JTextField();
    textFieldValorVenda.setColumns(10);
    textFieldValorVenda.setBounds(792, 219, 263, 26);
    contentPanel.add(textFieldValorVenda);
    {
      JPanel buttonPane = new JPanel();
      buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
      getContentPane().add(buttonPane, BorderLayout.SOUTH);
      {
        JButton okButton = new JButton("OK");
        okButton.addActionListener(
            new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                Estoque.getInstance();
                Peca p =
                    new Peca(
                        textFieldNomePeca.getText(),
                        textFieldDescricao.getText(),
                        textFieldCodPeca.getText(),
                        Double.parseDouble(textFieldValorCompra.getText()),
                        Double.parseDouble(textFieldValorVenda.getText()));

                Estoque.getInstance().inserePeca(p, 1);
                String msn = Integer.toString(Estoque.getInstance().quantPecas());


                setVisible(false);
              }
            });
        okButton.setActionCommand("OK");
        buttonPane.add(okButton);
        getRootPane().setDefaultButton(okButton);
      }
      {
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(
            new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                setVisible(false);
              }
            });
        cancelButton.setActionCommand("Cancel");
        buttonPane.add(cancelButton);
      }
    }
  }
}
