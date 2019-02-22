package fixar_oo;

public class Player {

	private int life =100;
	
	
	public void atacarInimigo(Enemy inimigo) {
		inimigo.life--;
	}
	
}
