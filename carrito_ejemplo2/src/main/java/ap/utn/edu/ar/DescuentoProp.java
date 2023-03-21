package ap.utn.edu.ar;

public class DescuentoProp extends Descuento {

	public DescuentoProp(double valor) {
		
		this.valor = valor;
	}
	
	@Override
	public double aplicar(Carrito carrito) {
		return (carrito.costoFinal() - 
				this.valor * carrito.costoFinal());
	}

}
