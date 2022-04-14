package app;


import database.ClienteRepo;
import database.Conection;
import model.*;

public class Main {

	public static void main(String[] args) {
		
		ClienteRepo dbc = new ClienteRepo();
		
		Cliente cliente = new Cliente("Tomas", "Lanchas", "675", "mar del plata", 17, 01, 2001);
		
		Conection conexion = new Conection();
		
		
		
		dbc.insertClient(cliente);
		dbc.selectClients();
		
		

	}

}
