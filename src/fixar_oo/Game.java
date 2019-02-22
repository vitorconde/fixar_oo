package fixar_oo;

public class Game {
	
	
	private Player player;
	private Enemy enemy;
	
	
	private Game() {
		player = new Player();
		enemy = new Enemy();
		
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Enemy getEnemy() {
		return enemy;
	}
	

	public static void main(String[] args) {
		Game game = new Game();
		Player player = game.getPlayer();
		player.atacarInimigo(game.getEnemy());
		System.out.print("Você atacou! -1 de vida do inimigo : ");
		System.out.print(game.getEnemy().life);
		
	}
	
	
}
