package Janelas;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.html.ImageView;
import javax.swing.text.Element;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class JanelaPrincipal {
	
	ImageIcon image = new ImageIcon(getClass().getResource("CAPA_FACEBOOK_01.png"));
	JLabel labeImage = new JLabel(image);
	
	
	private JFrame frmMotoPeas;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal window = new JanelaPrincipal();
					window.frmMotoPeas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaPrincipal() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frmMotoPeas = new JFrame();
		frmMotoPeas.setTitle("Rato Motos");
		frmMotoPeas.setBounds(100, 100, 1071, 732);
		frmMotoPeas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMotoPeas.getContentPane().setLayout(null);
		labeImage.setBounds(19, 6, 1032, 325);
		frmMotoPeas.getContentPane().add(labeImage);
		
		JButton btnCadNewUser = new JButton("Cadastrar Usuário");
		btnCadNewUser.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnCadNewUser.setIcon(new ImageIcon("/Users/robsonandrei/git/MotoPecas/src/src/Janelas/LeitllRatoe.png"));
		btnCadNewUser.setForeground(new Color(0, 128, 128));
		btnCadNewUser.setBackground(new Color(0, 128, 128));
		btnCadNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaCadUsuario ja = new JanelaCadUsuario();
				ja.setVisible(true);
			}
		});
		btnCadNewUser.setBounds(154, 344, 257, 60);
		frmMotoPeas.getContentPane().add(btnCadNewUser);
		
		JButton btnCadastrarPeca = new JButton("Cadastrar Peça");
		btnCadastrarPeca.setIcon(new ImageIcon("/Users/robsonandrei/git/MotoPecas/src/src/Janelas/LeitllRatoe.png"));
		btnCadastrarPeca.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnCadastrarPeca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaCadPecas ja = new JanelaCadPecas();
				ja.setVisible(true);
			}
		});
		btnCadastrarPeca.setForeground(new Color(0, 128, 0));
		btnCadastrarPeca.setBackground(new Color(0, 128, 128));
		btnCadastrarPeca.setBounds(423, 344, 233, 60);
		frmMotoPeas.getContentPane().add(btnCadastrarPeca);
		
		JButton btnOrcamento = new JButton("Orçamento & Venda\n");
		btnOrcamento.setHorizontalAlignment(SwingConstants.LEADING);
		btnOrcamento.setIcon(new ImageIcon("/Users/robsonandrei/git/MotoPecas/src/src/Janelas/LeitllRatoe.png"));
		btnOrcamento.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnOrcamento.setForeground(new Color(0, 0, 0));
		btnOrcamento.setBackground(new Color(0, 128, 128));
		btnOrcamento.setBounds(154, 416, 257, 60);
		frmMotoPeas.getContentPane().add(btnOrcamento);
		
		JButton btnVales = new JButton("Vales ");
		btnVales.setIcon(new ImageIcon("/Users/robsonandrei/git/MotoPecas/src/src/Janelas/LeitllRatoe.png"));
		btnVales.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnVales.setForeground(new Color(255, 0, 0));
		btnVales.setBackground(new Color(0, 128, 128));
		btnVales.setBounds(668, 344, 245, 60);
		frmMotoPeas.getContentPane().add(btnVales);
		
		JButton btnCaderno = new JButton("Caderno");
		btnCaderno.setIcon(new ImageIcon("/Users/robsonandrei/git/MotoPecas/src/src/Janelas/LeitllRatoe.png"));
		btnCaderno.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnCaderno.setForeground(Color.RED);
		btnCaderno.setBackground(new Color(0, 0, 0));
		btnCaderno.setBounds(668, 416, 245, 60);
		frmMotoPeas.getContentPane().add(btnCaderno);
		
		JButton btnRelatorios = new JButton("Relatórios");
		btnRelatorios.setIcon(new ImageIcon("/Users/robsonandrei/git/MotoPecas/src/src/Janelas/LeitllRatoe.png"));
		btnRelatorios.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnRelatorios.setForeground(new Color(0, 0, 255));
		btnRelatorios.setBackground(new Color(0, 128, 128));
		btnRelatorios.setBounds(423, 416, 233, 60);
		frmMotoPeas.getContentPane().add(btnRelatorios);
		
		JLabel lblNewLabel = new JLabel("By Robson Andrei - \nrobson.andrei@edu.pucrs.br -\n # 51 968 475 556");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(291, 675, 495, 29);
		frmMotoPeas.getContentPane().add(lblNewLabel);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente\n");
		btnCadastrarCliente.setIcon(new ImageIcon("/Users/robsonandrei/git/MotoPecas/src/src/Janelas/LeitllRatoe.png"));
		btnCadastrarCliente.setForeground(Color.ORANGE);
		btnCadastrarCliente.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnCadastrarCliente.setBackground(new Color(0, 128, 128));
		btnCadastrarCliente.setBounds(154, 488, 257, 60);
		frmMotoPeas.getContentPane().add(btnCadastrarCliente);
		
		JButton btnBuscarOramento = new JButton("Buscar Orçamento\n\n");
		btnBuscarOramento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscarOramento.setIcon(new ImageIcon("/Users/robsonandrei/git/MotoPecas/src/src/Janelas/LeitllRatoe.png"));
		btnBuscarOramento.setForeground(Color.ORANGE);
		btnBuscarOramento.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnBuscarOramento.setBackground(new Color(0, 128, 128));
		btnBuscarOramento.setBounds(423, 488, 233, 60);
		frmMotoPeas.getContentPane().add(btnBuscarOramento);
		
		JButton btnEstoque = new JButton("Estoque");
		btnEstoque.setIcon(new ImageIcon("/Users/robsonandrei/git/MotoPecas/src/src/Janelas/LeitllRatoe.png"));
		btnEstoque.setForeground(new Color(0, 0, 255));
		btnEstoque.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnEstoque.setBackground(Color.BLACK);
		btnEstoque.setBounds(668, 488, 245, 60);
		frmMotoPeas.getContentPane().add(btnEstoque);
		
		JButton btnCadastroPatrimonio = new JButton("Cadastro Patrimonio");
		btnCadastroPatrimonio.setIcon(new ImageIcon("/Users/robsonandrei/git/MotoPecas/src/src/Janelas/LeitllRatoe.png"));
		btnCadastroPatrimonio.setForeground(new Color(0, 128, 0));
		btnCadastroPatrimonio.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnCadastroPatrimonio.setBackground(new Color(0, 128, 128));
		btnCadastroPatrimonio.setBounds(154, 560, 257, 60);
		frmMotoPeas.getContentPane().add(btnCadastroPatrimonio);
		
		JButton btnDespesaDiria = new JButton("Despesa Diária");
		btnDespesaDiria.setIcon(new ImageIcon("/Users/robsonandrei/git/MotoPecas/src/src/Janelas/LeitllRatoe.png"));
		btnDespesaDiria.setForeground(new Color(255, 0, 0));
		btnDespesaDiria.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnDespesaDiria.setBackground(new Color(0, 128, 128));
		btnDespesaDiria.setBounds(423, 560, 233, 60);
		frmMotoPeas.getContentPane().add(btnDespesaDiria);
		
		JButton btnServios = new JButton("Serviços");
		btnServios.setIcon(new ImageIcon("/Users/robsonandrei/git/MotoPecas/src/src/Janelas/LeitllRatoe.png"));
		btnServios.setForeground(Color.BLUE);
		btnServios.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnServios.setBackground(Color.BLACK);
		btnServios.setBounds(668, 560, 245, 60);
		frmMotoPeas.getContentPane().add(btnServios);
		
		
		
	}
}
