package Clases;

public abstract class ElementoConNombre {
		private String Nombre;

		public ElementoConNombre(String nombre) {
			super();
			Nombre = nombre;
		}

		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		
}
