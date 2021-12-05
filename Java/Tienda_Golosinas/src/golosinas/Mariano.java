package golosinas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Mariano {
	
	static Scanner leer = new Scanner(System.in);
	static ArrayList<Golosina> listaGolosinas = new ArrayList<Golosina>();
	
	
	public static void main(String[] args){
		String sabor = "frutilla";
		List<String> miLista = Arrays.asList("Oblea","Chupetin","Bombon");

		comprar();
		System.out.println("\nCantidad de golosinas: " + cantidadDeGolosinas());
		//System.out.println(tieneLaGolosina("Oblea")); // hacer test
		//probarGolosina() // chequear dsp el estado
		System.out.println("Golosinas sin TACC: " + hayGolosinaSinTACC());
		System.out.println("Precios cuidados: " + preciosCuidados());
		
		System.out.println("\nPrimer golosina de gusto '" + sabor + "': " + golosinaDeSabor(sabor));
		System.out.println("Golosinas en la bolsa de gusto '" + sabor + "': " + golosinasDeSabor(sabor));
		System.out.println("Sabores que se ha comprado: " + sabores());
		System.out.println("Golosina mas cara de la bolsa: " + golosinaMasCara());
		
		System.out.println("\nPeso total de la bolsa de golosinas: " + pesoGolosinas());
		System.out.println("Golosinas faltantes: " + golosinasFaltantes(miLista));

	}
	

	private static void comprar(){
		
		char resp;
		int op;
		
		do {
			do {
				System.out.println("Seleccione la golosina que desea comprar:");
				System.out.println("1- Bombon");
				System.out.println("2- Alfajor");
				System.out.println("3- Caramelo");
				System.out.println("4- Chupetin");
				System.out.println("5- Oblea");
				System.out.println("6- Chocolatin");
				System.out.println("7- Tutti-frutti");
			
				op = leer.nextInt();
			}while(op < 1 || op > 7);
			
			switch(op){
				case 1:
					crearGolosina(new Bombon());
					break;
				case 2:
					crearGolosina(new Alfajor());
					break;
				case 3:
					crearGolosina(new Caramelo());
					break;
				case 4:
					crearGolosina(new Chupetin());
					break;
				case 5:
					crearGolosina(new Oblea());
					break;
				case 6:
					crearChocolatin();
					
					break;
				case 7:
					crearGolosina(new TuttiFrutti());
					break;
			}
			
			System.out.println("Desea ingresar otra golosina? (s/n): ");
			resp = leer.next().charAt(0);
			
		}while(resp == 's' || resp == 'S');
	}
	
	public static void crearChocolatin() { // pensar una alternativa
		double peso;
		
		System.out.println("Elija el peso del chocolate: ");
		peso = leer.nextDouble();
		
		Golosina unChocolatin = new Chocolatin(peso);
		listaGolosinas.add(unChocolatin);
	}	
	
	public static void crearGolosina(Golosina tipo) {
		listaGolosinas.add(tipo);
	}	
	
	public static void desechar(Golosina unaGolosina) {
		listaGolosinas.remove(unaGolosina);
	}
	
	public static int cantidadDeGolosinas() {
		return listaGolosinas.size();
	}
/*
	public static boolean tieneLaGolosina(String unaGolosina) {
		return listaGolosinas.stream()
				.anyMatch(golo -> golo.getName().equals(unaGolosina));
	}*/
	
	public static void probarGolosina() {
		for(Golosina tipo: listaGolosinas) {
			tipo.mordisco();
		}
	}
	
	public static boolean hayGolosinaSinTACC() {
		return listaGolosinas.stream().anyMatch(golosina -> golosina.isLibreGluten());
	}
	
	public static boolean preciosCuidados() {
		return listaGolosinas.stream()
				.allMatch(golo -> golo.precio() <= 10);
	}
	
	public static String golosinaDeSabor(String unSabor) {
		return listaGolosinas.stream()
				.filter(v -> v.gusto() == unSabor)
				.findFirst()
				.orElse(null)
			.getName();
	}
	// me tiene q devovler de una
	public static List<String> golosinasDeSabor(String unSabor) {

		return listaGolosinas.stream()
				.filter(v -> v.gusto() == unSabor)
				.map(golo-> golo.getName())
				.collect(Collectors.toList());
	}
	 
	public static Set<String> sabores() {
		Set<String> miSet= new HashSet<String>();
		
		for(Golosina golo: listaGolosinas) {
			miSet.add(golo.gusto());
		}
		return miSet;
	}
	// Optional quiere decir q puede ser null
	public static String golosinaMasCara() {
		return Collections
				.max(listaGolosinas, Comparator.comparing(golo -> golo.precio()))
				.getName();
	}
	
	public static double pesoGolosinas() {
		return listaGolosinas.stream()
				.mapToDouble(golo -> golo.peso())
				.sum();
	}
	
	public static List<String> golosinasFaltantes(List<String> golosinasDeseadas){
		return golosinasDeseadas.stream()
				.filter(golosina -> !crearLista(listaGolosinas).contains(golosina))
				.collect(Collectors.toList());
		

		//listaGolo contiene listaDeseada
	}
	
	private static List<String> crearLista(ArrayList<Golosina> lista) {	
		return lista.stream()
				.map(g -> g.getName())
				.collect(Collectors.toList());
	}

}

