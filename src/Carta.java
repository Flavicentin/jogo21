import javax.swing.JOptionPane;

public class Carta {
	
	private int numero;
	private Naipe naipe;
	
	public Carta(int numero, Naipe naipe) {
		super();
		this.numero = numero;
		this.naipe = naipe;
	}

	public int getNumero() {
		return numero;
	}

	public Naipe getNaipe() {
		return naipe;
	}
	
	public String toString() {
		if (numero == 1)
			return "A " + naipe;
		else if (numero == 11)
			return "J " + naipe;
		else if (numero == 12) 
			return "Q " + naipe;
		else if (numero == 13)
			return "K " + naipe;
		else
			return numero + " " + naipe;
	}
	
	public static void main(String[] args) {
		Carta c1 = new Carta(1, Naipe.PAUS);
		Carta c2 = new Carta(7, Naipe.COPAS);
		Carta c3 = new Carta(12, Naipe.OUROS);
		
		System.out.println(c1);
		JOptionPane.showMessageDialog(null, c3);
		
	}
}
