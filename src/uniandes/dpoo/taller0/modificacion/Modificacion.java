package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Hola, mundo!");
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		
		List<String> list_keys = new ArrayList<>(calc.paisConMasMedallistas().keySet());
		System.out.println("El nombre del pais con más medallistas es: "+list_keys.get(0));
	}
}
