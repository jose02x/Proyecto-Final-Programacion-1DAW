package Clases;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Equipo extends ElementoConNombre {
	private BufferedImage escudo;
	private ArrayList<futbolista> futbolistas;
	
	
	public Equipo(String nombre, BufferedImage escudo, ArrayList<futbolista> futbolistas) {
		super(nombre);
		this.escudo = escudo;
		this.futbolistas = futbolistas;
	}
	
	

}
