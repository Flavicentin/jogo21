import java.util.Random;

public class Baralho {

	private Carta[] monte;
	private int topo = 0;

	public Baralho() {

		this.monte = new Carta[52];

		int i = 0;
		for (int j = 1; j <= 13; j++) {		
			monte[i] = new Carta(j, Naipe.OUROS);
			i++;
		}

		for (int j = 1; j <= 13; j++) {		
			monte[i] = new Carta(j, Naipe.ESPADAS);
			i++;
		}

		for (int j = 1; j <= 13; j++) {		
			monte[i] = new Carta(j, Naipe.COPAS);
			i++;
		}

		for (int j = 1; j <= 13; j++) {		
			monte[i] = new Carta(j, Naipe.PAUS);
			i++;
		}
	}

	public void imprime() {
		for(Carta c : monte) {
			System.out.println(c);
		}		
	}

	public void embaralha() {
		Random r = new Random();
		for(int i = 0; i < 200; i++) {
			int x = r.nextInt(52);
			int y = r.nextInt(52);
			Carta aux = monte[x];
			monte[x] = monte[y];
			monte[y] = aux;
		}
	}

	public Carta compra() {
		if (topo >= monte.length)
			return null;
		else
			return monte[topo++];
	}

	public static void main(String[] args) {
		Baralho maco = new Baralho();
		maco.imprime();
	}


}
