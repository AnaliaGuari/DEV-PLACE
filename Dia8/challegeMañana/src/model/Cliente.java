package model;

public class Cliente extends Persona{
	private static int clienteId;
	private int idCliente;
		public Cliente(String nombre, String apellido, String dni, String direccion, int dia, int mes, int a�os) {
			super(nombre, apellido, dni, direccion, dia, mes, a�os);
			clienteId++;
			idCliente = clienteId;
		}

		public static int getClientId() {
			return clienteId;
		}

		public static void setClientId(int clientId) {
			Cliente.clienteId = clientId;
		}

		public int getIdCliente() {
			return idCliente;
		}

		public void setIdCliente(int idClient) {
			this.idCliente = idClient;
		}
}
