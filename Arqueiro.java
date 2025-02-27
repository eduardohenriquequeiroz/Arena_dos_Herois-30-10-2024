package ArenaDosHerois;

public class Arqueiro extends Personagem{

	public Arqueiro(String nome) {
		super(nome, 80, 20); // Menos vida, mas ataque à distância
	}

	@Override
	public void atacar (Personagem oponente) {
		oponente.receberDano (this.getDanoBase());
		System.out.println(getNome() + " disparou uma flecha em " + oponente.getNome() + " à distânica.");
	}
}
