package pescaderia;

import java.util.List;

public class Tienda {
	private Turno turnoActual;
	private Turno ultimoTurnoDado;
	private List<Cliente> clientes;

	public Turno getTurnoActual() {
		return turnoActual;
	}

	public Turno darTurno(Cliente cliente) {
		Turno turno = new Turno(ultimoTurnoDado.getValor()+1);
		return null;
		
	}
	
	

}
