package oo.heranca;

public class Jogador {

	int vida = 100;
	int x;
	int y;
	
	public Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void andar(Direcao direcao) {
		switch (direcao) {
			case Direcao.NORTE: {
				y++; break; 
			}
			case Direcao.SUL: {
				y--; break; 
			}
			case Direcao.LESTE: {
				x++; break;
			}
			case Direcao.OESTE: {
				x--; break;
			}
		}
	}
	
	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		}else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		}else {
			return false;
		}
	}
}
