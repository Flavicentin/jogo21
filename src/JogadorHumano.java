import javax.swing.JOptionPane;

public class JogadorHumano {
	
	private Carta[] mao;
	private int pontos;
	private int topo;
	
	
	public JogadorHumano() {
		this.mao = new Carta[12];
	}
	
	public JogadorHumano(Carta a, Carta b) {
		this(); //chamando o construtor padrão (sem nenhum parâmetro)
		this.mao[0] = a;
		this.mao[1] = b;
		this.pontos = getPontosCarta(a);
		this.pontos = this.pontos + getPontosCarta(b);
		this.topo = 2;
	}
	
	public void addCarta(Carta c) {
		mao[topo] = c;
		pontos = pontos + getPontosCarta(c);
		topo++;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public boolean querCarta() {
		String msg = this.toString() + "\npontos: " + pontos;
		int resp = JOptionPane.showConfirmDialog(null, msg, "Quer carta?", 
				JOptionPane.YES_NO_OPTION);
		if (resp == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public String toString() {
		int i = 0;
		String aux = "";
		while (i < topo) {
			aux = aux + mao[i].toString() + " ";
			i++;
		}
		return aux;
	}
	
	
	private int getPontosCarta(Carta c) {
		if (c.getNumero() > 10)
			return 10;
		else
			return c.getNumero();
	}
	
	
}
