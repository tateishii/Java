package br.com.poo.estrutrurairepeticao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EstruturaWhile1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtInicial;
	private JTextField txtFinal;
	
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
		setBackground(new Color(255, 0, 128));
		setTitle("Janela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 408);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número Inicial");
		lblNewLabel.setFont(new Font("Segoe UI Historic", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setBounds(10, 11, 149, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número Final");
		lblNewLabel_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1.setFont(new Font("Segoe UI Historic", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(10, 53, 117, 20);
		contentPane.add(lblNewLabel_1);
		
		txtInicial = new JTextField();
		txtInicial.setBounds(142, 19, 86, 20);
		contentPane.add(txtInicial);
		txtInicial.setColumns(10);
		
		txtFinal = new JTextField();
		txtFinal.setBounds(142, 56, 86, 20);
		contentPane.add(txtFinal);
		txtFinal.setColumns(10);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 155, 160, 170);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnExecutar = new JButton("Executar");
		btnExecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExecutar.setForeground(new Color(128, 0, 128));
		btnExecutar.setBackground(new Color(255, 255, 255));
		btnExecutar.setFont(new Font("Segoe UI Historic", Font.BOLD | Font.ITALIC, 16));
		btnExecutar.setBounds(10, 99, 117, 23);
		contentPane.add(btnExecutar);
	}
}
