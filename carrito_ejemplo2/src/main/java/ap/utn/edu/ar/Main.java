package ap.utn.edu.ar;

public class Main {

	public static void main(String[] args) {
		
		Descuento desc = null;
		if (args[0].equals("prop")) {
			desc = new DescuentoProp(0.2);
		}
		if (args[0].equals("fijo")) {
			desc = new DescuentoFijo(400);
		}
		
		
		Persona persona1 = new Persona( "Mariana", "Gonzalez" ) ;
		Producto producto1 = new Producto("cepillo de dientes"); 
		producto1.setPrecio(550.0);		
		Producto producto2 = new Producto("Pasta de dientes");
		producto2.setPrecio(750.0);
		Carrito c1 = new Carrito(persona1);
		c1.setProducto1(producto1);
		c1.setProducto2(producto2);
		
		System.out.println(c1.costoFinal());
		System.out.println(desc.aplicar(c1));
		
	}

}
