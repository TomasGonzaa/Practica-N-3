package practica3;

public class E {
		public static void main(String[]args) {
			
			String cursos[] = {"Marketing Digital","Finanzas","Facebook Ads"};
		    int calificaciones[] = {8,5,10};
		    
		    System.out.println("CURSOS REALIZADOS AÑO 2022");
		    for(int i=0 ; i< cursos.length ;i++) {
		    	System.out.println("Curso: " + cursos[i] + ", Calificación: " + calificaciones[i]);
		    }
		    int promedio = (calificaciones[0] + calificaciones[1] + calificaciones[2])/3;
		    System.out.println("CALIFICACIÓN PROMEDIO: " + promedio); //(calificaciones[0] + calificaciones[1] + calificaciones[2])/3);
}
}
