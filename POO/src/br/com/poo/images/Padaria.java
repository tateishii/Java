package br.com.poo.images;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Padaria extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigoProduto;
	private JTextField txtCodigoBarras;
	private JTextField txtDescricao;
	private JTextField txtValor;
	private JTextField txtQuantidade;
	private JTextField txtTotal;
	private JTextField txtSubtotal;
	private JTextArea txtNota;
	private String cabecalho; 
	private int item;
	private double valorPagar;
	private JLabel lblNewLabel;
	private JLabel lblValorPagar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Padaria frame = new Padaria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Padaria() {
		
		valorPagar = 0.0; 
		item = 1;
		
		
		cabecalho = "\t\t\t A Padaria\n"+
					"\n\t\t Av. Magrao Gay, 699 - Papa Nova Guiné"+
					"\n\t\t CEP: 5723-9080 - Lae - PAPNVG"+
					"\nCNPJ: 67.456./0001-89"+
					"\nIE:005.86347.0004"+
					"\nIM:6.564/001-5"+
					"\n-------------------------------------------------------------------------------------------------"
					+ "------------------------------------------------------------------------------------------------------------"+
					"\n\t\t                       CUPOM FISCAL"+
					"\nItem\tCodigo\tDescricao\t\tQTD\tVL.UNIT\t\tVL.Total"+
					"\n-----------------------------------------------------------------------------------------------------"
					+ "-------------------------------------------------------------------------------------------------------";
					
					
		
		
		
		String[][] produtos = {
				
				{"2023","Pão Francês","13.00","17032023"},
				{"2024","Pão de Leite","15.00","140232024"},
				{"2025","Torta de Frango","50.00","17032025"},
				{"2026","Leite Integral","5.00","17032026"},
				{"2027","Manteiga","5.00","17032027"},
				{"2028","Bolo","20.00","17032028"},
				{"2029","Bauru","12.00","17032029"},
				{"2030","Suco Laranja","7.00","17032030"}
		};
		
		setTitle("Janela Padaria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlEsquerdo = new JPanel();
		pnlEsquerdo.setForeground(new Color(0, 0, 0));
		pnlEsquerdo.setBounds(0, 0, 800, 700);
		pnlEsquerdo.setBackground(Color.LIGHT_GRAY);
		contentPane.add(pnlEsquerdo);
		pnlEsquerdo.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(0, 0, 800, 300);
		
		/*
		 * Para ajustar a imagem ao tamanho da label, foi necessário aplicar o comando
		 * new ImageIcon para definir a scala no elemento getImage.
		 * O tamanho da imagem foi de ajustado para largura da label(lbl.getWidth) e altura da
		 * label (lbl.Heigth) e para finalizar, foi alterado a form do fechamento da 
		 * imagem quando a tela fecha, foi setado o valor para suavização(image.SCALE_SMOOTH).
		 */
		
		lblLogo.setIcon(new ImageIcon(new ImageIcon(Padaria.class.getResource("/br/com/poo/images/padaria 2.jpg")).getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
		
		pnlEsquerdo.add(lblLogo);
		
		JLabel lblCodigoProduto = new JLabel("Codigo do Produto:");
		lblCodigoProduto.setFont(new Font("Swis721 Blk BT", Font.ITALIC, 20));
		lblCodigoProduto.setBounds(10, 334, 221, 43);
		pnlEsquerdo.add(lblCodigoProduto);
		
		txtCodigoProduto = new JTextField();
		txtCodigoProduto.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				for(int linha = 0 ; linha < produtos.length ; linha++) {
				
					for(int coluna = 0 ; coluna < produtos[0].length; ++coluna) {
						if(txtCodigoProduto.getText().equals (produtos[linha][0])) {
							txtCodigoBarras.setText(produtos[linha][3]);
							txtDescricao.setText(produtos[linha][1]);
							txtValor.setText(produtos[linha][2]);
							
						}
						
					}
			
				}
		
			}		
		});
		txtCodigoProduto.setBackground(Color.LIGHT_GRAY);
		txtCodigoProduto.setForeground(Color.BLACK);
		txtCodigoProduto.setBounds(10, 370, 221, 31);
		pnlEsquerdo.add(txtCodigoProduto);
		txtCodigoProduto.setColumns(10);
		txtCodigoProduto.setBorder(null);
		
		txtCodigoBarras = new JTextField();
		txtCodigoBarras.setForeground(Color.BLACK);
		txtCodigoBarras.setColumns(10);
		txtCodigoBarras.setBackground(Color.LIGHT_GRAY);
		txtCodigoBarras.setBounds(427, 370, 221, 31);
		pnlEsquerdo.add(txtCodigoBarras);
		txtCodigoBarras.setBorder(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 412, 800, 2);
		pnlEsquerdo.add(separator);
		
		
		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setFont(new Font("Swis721 Blk BT", Font.ITALIC, 20));
		lblDescricao.setBounds(10, 433, 221, 43);
		pnlEsquerdo.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setForeground(Color.BLACK);
		txtDescricao.setColumns(10);
		txtDescricao.setBackground(Color.LIGHT_GRAY);
		txtDescricao.setBounds(10, 472, 705, 31);
		pnlEsquerdo.add(txtDescricao);
		txtDescricao.setBorder(null);
		
		JLabel lblBarras = new JLabel("Codigo de Barras:");
		lblBarras.setFont(new Font("Swis721 Blk BT", Font.ITALIC, 20));
		lblBarras.setBounds(427, 334, 221, 43);
		pnlEsquerdo.add(lblBarras);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 526, 800, 2);
		pnlEsquerdo.add(separator_1);
		
		JLabel lblValor = new JLabel("Valor Unitário:");
		lblValor.setFont(new Font("Swis721 Blk BT", Font.ITALIC, 20));
		lblValor.setBounds(10, 526, 221, 43);
		pnlEsquerdo.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setForeground(Color.BLACK);
		txtValor.setColumns(10);
		txtValor.setBackground(Color.LIGHT_GRAY);
		txtValor.setBounds(10, 562, 221, 31);
		pnlEsquerdo.add(txtValor);
		txtValor.setBorder(null);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Swis721 Blk BT", Font.ITALIC, 20));
		lblQuantidade.setBounds(291, 526, 221, 43);
		pnlEsquerdo.add(lblQuantidade);
		
		txtQuantidade = new JTextField();
		txtQuantidade.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				
				txtTotal.setText(""+
						Double.parseDouble(txtQuantidade.getText())*
						Double.parseDouble(txtValor.getText())
						);
				
				txtSubtotal.setText("R$"+
						Double.parseDouble(txtQuantidade.getText())*
						Double.parseDouble(txtValor.getText())
						);
				
			}
		});
		txtQuantidade.setForeground(Color.BLACK);
		txtQuantidade.setColumns(10);
		txtQuantidade.setBackground(Color.LIGHT_GRAY);
		txtQuantidade.setBounds(291, 562, 221, 31);
		pnlEsquerdo.add(txtQuantidade);
		txtQuantidade.setBorder(null);
		
		JLabel lblItem = new JLabel("Total Item:");
		lblItem.setFont(new Font("Swis721 Blk BT", Font.ITALIC, 20));
		lblItem.setBounds(569, 526, 221, 43);
		pnlEsquerdo.add(lblItem);
		
		txtTotal = new JTextField();
		txtTotal.setForeground(Color.BLACK);
		txtTotal.setColumns(10);
		txtTotal.setBackground(Color.LIGHT_GRAY);
		txtTotal.setBounds(569, 562, 221, 31);
		pnlEsquerdo.add(txtTotal);
		txtTotal.setBorder(null);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(0, 604, 800, 2);
		pnlEsquerdo.add(separator_1_1);
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setFont(new Font("Swis721 Blk BT", Font.ITALIC, 25));
		lblSubtotal.setBounds(10, 604, 221, 43);
		pnlEsquerdo.add(lblSubtotal);
		
		txtSubtotal = new JTextField();
		txtSubtotal.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 35));
		txtSubtotal.setForeground(Color.BLACK);
		txtSubtotal.setColumns(10);
		txtSubtotal.setBackground(Color.LIGHT_GRAY);
		txtSubtotal.setBounds(291, 617, 185, 72);
		pnlEsquerdo.add(txtSubtotal);
		txtSubtotal.setBorder(null);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cabecalho+="\n"+item+"\t"+txtCodigoProduto.getText()+
						"\t"+txtDescricao.getText()+
						"\t\t"+txtQuantidade.getText()+
						"\t"+txtValor.getText()+
						"\t\t"+txtTotal.getText();
						
						
						
						txtNota.setText(cabecalho);	
						item++;
						
						valorPagar += Double.parseDouble(txtTotal.getText());
						lblValorPagar.setText("R$ "+valorPagar);
						
						
			}
		});
		
		btnIncluir.setIcon(new ImageIcon(Padaria.class.getResource("/br/com/poo/images/Botao1.png")));
		btnIncluir.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 20));
		btnIncluir.setBackground(Color.WHITE);
		btnIncluir.setForeground(Color.BLACK);
		btnIncluir.setBounds(552, 617, 198, 62);
		pnlEsquerdo.add(btnIncluir);
		
		JPanel pnlDireito = new JPanel();
		pnlDireito.setBackground(Color.LIGHT_GRAY);
		pnlDireito.setForeground(Color.WHITE);
		pnlDireito.setBounds(810, 0, 774, 700);
		contentPane.add(pnlDireito);
		pnlDireito.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 774, 700);
		pnlDireito.add(scrollPane);
		
	    txtNota = new JTextArea();
		scrollPane.setViewportView(txtNota);
		txtNota.setText(cabecalho);
		
		JPanel pnlBase = new JPanel();
		pnlBase.setBackground(Color.LIGHT_GRAY);
		pnlBase.setForeground(Color.BLACK);
		pnlBase.setBounds(0, 710, 1584, 150);
		contentPane.add(pnlBase);
		pnlBase.setLayout(null);
		
	    lblNewLabel = new JLabel("Valor a Pagar:");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 26));
		lblNewLabel.setBounds(775, 41, 233, 78);
		pnlBase.add(lblNewLabel);
		
	    lblValorPagar = new JLabel("");
		lblValorPagar.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 50));
		lblValorPagar.setBounds(1099, 41, 475, 78);
		pnlBase.add(lblValorPagar);
		lblValorPagar.setText("R$"+valorPagar);
	}
}
