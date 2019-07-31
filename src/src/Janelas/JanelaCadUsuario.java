package Janelas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNomeCompleto;
	private JTextField textFieldsenha;
	private JTextField textFieldConfirSenha;
	private JTextField textFieldLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JanelaCadUsuario dialog = new JanelaCadUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JanelaCadUsuario() {
		setTitle("Cadastro de Usuários");
		setBounds(100, 100, 895, 366);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel(new ImageIcon("/Users/robsonandrei/git/MotoPecas/src/perfil 03.png"));
		label.setBounds(36, 36, 181, 155);
		contentPanel.add(label);
		
		JLabel lblnomecompleto = new JLabel("Nome completo do usuário:");
		lblnomecompleto.setForeground(Color.GRAY);
		lblnomecompleto.setBounds(258, 46, 187, 16);
		contentPanel.add(lblnomecompleto);
		
		textFieldNomeCompleto = new JTextField();
		textFieldNomeCompleto.setBounds(258, 62, 551, 26);
		contentPanel.add(textFieldNomeCompleto);
		textFieldNomeCompleto.setColumns(10);
		
		JLabel lblDigiteUmaSenha = new JLabel("Digite uma senha:");
		lblDigiteUmaSenha.setForeground(Color.GRAY);
		lblDigiteUmaSenha.setBounds(258, 149, 187, 16);
		contentPanel.add(lblDigiteUmaSenha);
		
		textFieldsenha = new JPasswordField();
		textFieldsenha.setToolTipText("password");
		textFieldsenha.setColumns(10);
		textFieldsenha.setBounds(258, 165, 171, 26);
		contentPanel.add(textFieldsenha);
		
		textFieldConfirSenha = new JPasswordField();
		textFieldConfirSenha.setToolTipText("password");
		textFieldConfirSenha.setColumns(10);
		textFieldConfirSenha.setBounds(475, 165, 171, 26);
		contentPanel.add(textFieldConfirSenha);
		
		JLabel labelconfrSenha = new JLabel("Confirme a senha:");
		labelconfrSenha.setForeground(Color.GRAY);
		labelconfrSenha.setBounds(475, 149, 187, 16);
		contentPanel.add(labelconfrSenha);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setColumns(10);
		textFieldLogin.setBounds(258, 111, 207, 26);
		contentPanel.add(textFieldLogin);
		
		JLabel lblLogin = new JLabel("Escolha um nome para LOGIN:");
		lblLogin.setForeground(Color.GRAY);
		lblLogin.setBounds(258, 95, 198, 16);
		contentPanel.add(lblLogin);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setForeground(new Color(0, 153, 0));
		btnNewButton.setBounds(258, 203, 117, 29);
		contentPanel.add(btnNewButton);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
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
