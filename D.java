package practica3;

public class D {
		public static void main(String[]args) {
			
			System.out.println("LISTADO DE PRODUCTOS Y PRECIOS");
			String productos[] = {"Camiseta","Casco Bicicleta","Gel Hidratante","Calza Nike","Remera Termica"};
		    double precios[] = {4500,6000,450.80,7999.99,9050};
		    
		    System.out.println("LISTADO DE PRODUCTOS Y PRECIOS");
		    for(int i=0 ; i< productos.length ;i++) {
		    	System.out.println("Producto: " + productos[i] + ", Precio: $" + precios[i]);
		    	
		    }
}
}
		