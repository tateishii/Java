package br.com.poo.switchsif;

import javax.swing.JOptionPane;

public class Estruturaswitch extends JOptionPane {
	
	public static void main(String[] args) {
		
		
		JOptionPane.showMessageDialog(null, "Olá! Bom dia","Sistema",JOptionPane.INFORMATION_MESSAGE);
		String estacao = JOptionPane.showInputDialog("Digite uma estação do ano");
		String rs;
		switch(estacao) {
		case "verão":
			rs = "Dezembro - Janeiro - Fevereiro";
		break;
		case "outono":
			rs = "Março - Abril - Maio";
		break;
		case "inverno":
			rs = "Junho - Julho - Agosto";
		break;
		case "primavera":
			rs = "Setembro - Outubro - Novembro";
		break;
		default:
			rs = "Está estação nao existe";
		break;	
			
		}
		JOptionPane.showMessageDialog(null, rs,"Resposta",JOptionPane.INFORMATION_MESSAGE);
	}
}