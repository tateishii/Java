package br.com.poo.estruturairepeticao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EstruturaWhile1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	String dados = "";
	int i;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstruturaWhile1 frame = new EstruturaWhile1();
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
	public EstruturaWhile1() {
		setResizable(false);
		setBackground(Color.GRAY);
		setTitle("Janela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 211, 467);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtInicial = new JLabel("Número Inicial");
		txtInicial.setBackground(Color.LIGHT_GRAY);
		txtInicial.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 11));
		txtInicial.setForeground(new Color(64, 64, 64));
		txtInicial.setBounds(10, -13, 92, 112);
		contentPane.add(txtInicial);
		
		JLabel txtFinal = new JLabel("Número Final");
		txtFinal.setForeground(Color.DARK_GRAY);
		txtFinal.setBackground(Color.WHITE);
		txtFinal.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 11));
		txtFinal.setBounds(10, 51, 92, 84);
		contentPane.add(txtFinal);
		
		textField = new JTextField();
		textField.setBounds(106, 33, 77, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 83, 77, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 165, 173, 252);
		contentPane.add(scrollPane);
		
		JTextArea txResultado = new JTextArea();
		scrollPane.setViewportView(txResultado);
		
		
		JButton btnExecutar = new JButton("Executar");
		btnExecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				i = Integer.parseInt(textField.getText());
				
				while(i <= Integer.parseInt(textField_1.getText())){
					dados += i+"\n";
					i++;
					
					
				}
				txResultado.setText(dados);
				textField.setText("");
				textField_1.setText("");
				dados = "";
				
			}
		});
		btnExecutar.setForeground(Color.DARK_GRAY);
		btnExecutar.setBackground(Color.PINK);
		btnExecutar.setBounds(10, 124, 173, 30);
		contentPane.add(btnExecutar);
	}
}
