import javax.swing.JOptionPane;

public class Jogo {
	
	public static void main(String[] args) {
		
		Baralho bar = new Baralho();
		bar.embaralha();
		
		JogadorHumano ze = new JogadorHumano();
		JogadorCpu cpu = new JogadorCpu(bar.compra(), bar.compra());
		
		ze.addCarta(bar.compra());
		ze.addCarta(bar.compra());
		
		while(ze.querCarta()) {
			ze.addCarta(bar.compra());
		}
		
		while(cpu.querCarta()) {
			cpu.addCarta(bar.compra());
		}
		
		if (ze.getPontos() <= 21 && cpu.getPontos() <= 21) {
			if (cpu.getPontos() >= ze.getPontos()) {
				JOptionPane.showMessageDialog(null, cpu + "\nCPU GANHOU");				
			}
			else {
				JOptionPane.showMessageDialog(null, cpu + "\nEU GANHEI");
			}
		}
		else if (ze.getPontos() <= 21 && cpu.getPontos() > 21) {
			JOptionPane.showMessageDialog(null, cpu + "\nEU GANHEI");
		}
		else if (ze.getPontos() > 21 && cpu.getPontos() <= 21) {
			JOptionPane.showMessageDialog(null, cpu + "\nCPU GANHOU");
		}
		else {
			JOptionPane.showMessageDialog(null, cpu + "\nNinguem Ganhou");
		}
		
		
		
		
		
		
		
		
	}

}
