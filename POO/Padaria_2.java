package EstruturaArray;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Padaria_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigoProduto;
	private JTextField textCodigoBarras;
	private JTextField textDescricao;
	private JTextField textQuantidade;
	private JTextField textQuant;
	private JTextField textTotal_Itens;
	private JTextField textSubtotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Padaria_2 frame = new Padaria_2();
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
	public Padaria_1() {
		
		
		String [] produtos {
			
			{"2023","Pão Francês","13.00","17032023"},
			{"2024","Pão de Leite", "R$15,00","14032024"};
			{"2025", "Torta de Frango", "50.00","17032023"};
			{"2027","Manteiga","5.00", "17032024"};
			{"2028", "Bolo","20.00", "17032028"};
			{"2031", "Leite", "7.00", "17032030"}
			{"2029","Bauru", "12.00", "17032029"};
			{"2030", "Suco Laranja", "7.00", "17032030"}
			
		};
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Esse comando trabalha na criação da tela e resolução de Pianel 
		
		JPanel pnlEsquerdo = new JPanel();
		pnlEsquerdo.setBackground(new Color(13, 124, 179));
		pnlEsquerdo.setBounds(0, 0, 800, 700);
		contentPane.add(pnlEsquerdo);
		pnlEsquerdo.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		//lblLogo.setIcon(new ImageIcon(new ImageIcon(Padaria_2.class.getResource("D:\\Java\\download.jfif")).getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));	
		lblLogo.setBounds(10, 11, 535, 233);
		pnlEsquerdo.add(lblLogo);
		
		JLabel lblCodigoProduto = new JLabel("Código do Produto");
		lblCodigoProduto.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 22));
		lblCodigoProduto.setForeground(new Color(255, 255, 255));
		lblCodigoProduto.setBounds(10, 218, 264, 94);
		pnlEsquerdo.add(lblCodigoProduto);
		
		JLabel lblCodigoBarras = new JLabel("Codigo de Barras");
		lblCodigoBarras.setForeground(Color.WHITE);
		lblCodigoBarras.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 22));
		lblCodigoBarras.setBounds(526, 218, 264, 94);
		pnlEsquerdo.add(lblCodigoBarras);
		
		textCodigoProduto = new JTextField();
		textCodigoProduto.addFocysListinner( new Facus Adapr(){
			@Override
			public void focusLost(FocusEvent e) {
			
				
				for (int linha = 0; linha < produtos.length; linha ++) {
					for (int coluna = 0 ; coluna < produtos[0].lenght; coluna ++);
					if(textCodigoProduto.getText() == produtos [linha][0]) {
						textCodigoBarras.setText(produtos [linha][3]);
						textDescricao.setText(produtos[linha][1]);
						textValorUnitario..setText(produtos[linha][2]);
						
					
						}
				    }
				}
			}
		});

		
		textCodigoProduto.setForeground(new Color(0, 120, 255));
		textCodigoProduto.setBackground(new Color(0, 128, 255));
		textCodigoProduto.setBounds(10, 277, 181, 30);
		pnlEsquerdo.add(textCodigoProduto);
		textCodigoProduto.setColumns(10);
		textCodigoProduto.setBorder(null);
		
		textCodigoBarras = new JTextField();
		textCodigoBarras.setForeground(new Color(255, 255, 255));
		textCodigoBarras.setColumns(10);
		textCodigoBarras.setBackground(new Color(0, 128, 255));
		textCodigoBarras.setBounds(526, 277, 181, 30);
		pnlEsquerdo.add(textCodigoBarras);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 310, 769, 2);
		pnlEsquerdo.add(separator);
		
		JLabel lblDescricao = new JLabel("Descricao do Produto\r\n");
		lblDescricao.setForeground(Color.WHITE);
		lblDescricao.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 22));
		lblDescricao.setBounds(10, 292, 264, 94);
		pnlEsquerdo.add(lblDescricao);
		
		textDescricao = new JTextField();
		textDescricao.setForeground(new Color(0, 128, 255));
		textDescricao.setColumns(10);
		textDescricao.setBackground(new Color(0, 128, 255));
		textDescricao.setBounds(10, 354, 769, 30);
		pnlEsquerdo.add(textDescricao);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 397, 780, 2);
		pnlEsquerdo.add(separator_1);
		
		JLabel lblValorUnitario = new JLabel("Valor Unitário");
		lblValorUnitario.setForeground(Color.WHITE);
		lblValorUnitario.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 22));
		lblValorUnitario.setBounds(10, 386, 264, 94);
		pnlEsquerdo.add(lblValorUnitario);
		
		textQuantidade = new JTextField();
		textQuantidade.setForeground(new Color(0, 128, 255));
		textQuantidade.setColumns(10);
		textQuantidade.setBackground(new Color(0, 128, 255));
		textQuantidade.setBounds(10, 450, 181, 30);
		pnlEsquerdo.add(textQuantidade);
		
		JLabel Quantidade = new JLabel("Quantidade");
		Quantidade.setForeground(Color.WHITE);
		Quantidade.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 22));
		Quantidade.setBounds(264, 386, 264, 94);
		pnlEsquerdo.add(Quantidade);
		
		textQuant = new JTextField();
		textQuant.setForeground(new Color(0, 128, 255));
		textQuant.setColumns(10);
		textQuant.setBackground(new Color(0, 128, 255));
		textQuant.setBounds(264, 450, 181, 30);
		pnlEsquerdo.add(textQuant);
		textQuant.setBorder(null);
		
		JLabel lblTotal_Itens = new JLabel("Total Itens");
		lblTotal_Itens.setForeground(Color.WHITE);
		lblTotal_Itens.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 22));
		lblTotal_Itens.setBounds(526, 386, 264, 94);
		pnlEsquerdo.add(lblTotal_Itens);
		
		textTotal_Itens = new JTextField();
		textTotal_Itens.setForeground(new Color(0, 128, 255));
		textTotal_Itens.setColumns(10);
		textTotal_Itens.setBackground(new Color(0, 128, 255));
		textTotal_Itens.setBounds(526, 450, 181, 30);
		pnlEsquerdo.add(textTotal_Itens);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 491, 780, 2);
		pnlEsquerdo.add(separator_2);
		
		JLabel lblSUbtotal = new JLabel("Subtotal");
		lblSUbtotal.setForeground(Color.WHITE);
		lblSUbtotal.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 40));
		lblSUbtotal.setBounds(10, 469, 264, 94);
		pnlEsquerdo.add(lblSUbtotal);
		
		textSubtotal = new JTextField();
		textSubtotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		textSubtotal.setForeground(new Color(0, 128, 255));
		textSubtotal.setColumns(10);
		textSubtotal.setBackground(new Color(0, 128, 255));
		textSubtotal.setBounds(178, 535, 408, 154);
		pnlEsquerdo.add(textSubtotal);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setBounds(690, 535, 89, 23);
		pnlEsquerdo.add(btnIncluir);
		
		JPanel pnlDireiro = new JPanel();
		pnlDireiro.setBackground(new Color(210, 210, 210));
		pnlDireiro.setBounds(810, 0, 774, 700);
		contentPane.add(pnlDireiro);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 710, 1584, 150);
		contentPane.add(panel_1);
	}
}
