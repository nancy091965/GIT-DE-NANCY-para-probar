package ap.utn.edu.ar;

public class DescuentoFijo extends Descuento {

	
	
	public DescuentoFijo(double valor) {
		
		this.valor = valor;
	}

	@Override
	public double aplicar(Carrito carrito) {
		return carrito.costoFinal() - this.valor;
	}

}
