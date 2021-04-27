package died.guia5;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		
		Alquiler alq1= new Alquiler("Martillo",LocalDate.now(),LocalDate.of(2021,6,10),20.50);
		Alquiler alq2= new Alquiler("Destornillador",LocalDate.of(2021, 3, 5),LocalDate.now(),10.05);
		Alquiler alq3= new Alquiler("Perforadora",LocalDate.of(2021,1,17),LocalDate.of(2021,2,17),57.00);
		
		System.out.println("el alquiler 2 se ha pagado? "+alq2.finalizado());
		alq2.setFechaDevolucion(LocalDate.now());
		System.out.println("El alquiler 2 tiene un costo de $"+alq2.costo());
		System.out.println("el alquiler 2 se ha devuelto a tiempo? "+alq2.enMora());
		
		Oficio of1= new Oficio("Albañil");
		Oficio of2= new Oficio("Carpintero");
		
		Trabajador t1 = new Trabajador("Juan",of1,120.5,0.10);
		Trabajador t2 = new Trabajador("Carlos",of2,100.0,0.10);
		
		
		Trabajo tarea1 =  new Trabajo(LocalDate.of(2021, 3, 5), new Oficio("Albañil"));
		Servicio s1 = new ServicioEstandar(new Oficio("Carpintero"), 50.0, 0.10,true);
		
		try {
			tarea1.agregarServicio(s1);
		}
		catch(ServicioNoCoincideException e) {
			System.out.println("Por favor, asigne un servicio que coincida con el oficio del trabajo");
		}
		
		s1.setTipo(of1);
		Servicio s2 = new ServicioPersonalizado(of1,100.0,300.64,90.0,false);
		try {
			tarea1.agregarServicio(s1);
			tarea1.agregarServicio(s2);
		}
		catch(ServicioNoCoincideException e) {
			System.out.println("Por favor, asigne un servicio que coincida con el oficio del trabajo");
		}
		
		System.out.println("La tarea 1 tiene un costo de: "+tarea1.costo());
		
		try {
			t1.AgregarTarea(tarea1);
		}
		catch(OficioNoCoincideException e) {
			System.out.println("Por favor, asigne un servicio que coincida con el oficio del trabajo");
		}
		catch(AgendaOcupadaException e) {
			System.out.println("Agenda ocupada, el trabajador no puede realizar la tarea en la fecha dada");
		}
		
		System.out.println("El trabajador "+t1.getNombre()+" esta disponible? " +(t1.disponible()? "si":"no"));
		System.out.println("El trabajador "+t2.getNombre()+" esta disponible? " +(t2.disponible()? "si":"no"));
		
		Usuario u1 = new Usuario("Pepe",41940922);
		u1.contratar(s1);
		try {
			u1.contratar(alq1);
			u1.contratar(alq2);
			u1.contratar(alq3);
		}
		catch(AlquilerNoEntregadoException e) {
			System.out.println("El usuario Pepe ya debe 2 alquileres, no puede contratar mas");
		}
		
		System.out.println("El usuario "+u1.getNombre()+" ha gastado un total de $"+u1.totalConsumido());
		
		
	}

}
