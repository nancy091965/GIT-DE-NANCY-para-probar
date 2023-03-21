package ap.utn.edu.ar;

public abstract class Descuento {

	protected double valor;
	
	/*
	if( this.tipo.equals("fijo") ) {
		return carrito.costoFinal() - this.valor;
	}
	if( this.tipo.equals("prop") ) {
		return (carrito.costoFinal() - 
				this.valor * carrito.costoFinal());
	}
*/
	
	

	public abstract double aplicar(Carrito carrito);
		
	
	
	
	
}
