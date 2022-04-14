package model;

import java.sql.Date;
import java.time.LocalDate;

public class Persona {
	protected static int idInfo;
	protected int idPersona;
		protected String nombre;
		protected String apellido;
		protected String dni;
		protected String direccion;
		protected LocalDate  fechaNacimiento;
		protected Date  fechaNacimientoSQL;
		
		
		
		
		
		public Persona(String firstname, String lastname, String dni, String address, int day, int month, int year) {
			super();
			this.nombre = firstname;
			this.apellido = lastname;
			this.dni = dni;
			this.direccion = address;
			this.fechaNacimiento = LocalDate.of(year, month, month);
			fechaNacimientoSQL = fechaNacimientoSQL.valueOf(fechaNacimiento);
			idInfo++;
			idPersona = idInfo;
		}
		
		public static int getIdInfo() {
			return idInfo;
		}

		public static void setIdInfo(int idInfo) {
			Persona.idInfo = idInfo;
		}

		public int getId() {
			return idPersona;
		}

		public void setId(int id) {
			this.idPersona = id;
		}

		public String getNombre() {
			return nombre;
		}
		public void setNombre(String firstname) {
			this.nombre = firstname;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String lastname) {
			this.apellido = lastname;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String address) {
			this.direccion = address;
		}
		public LocalDate getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(LocalDate birth) {
			this.fechaNacimiento = birth;
		}
		public Date getFechaNacimientoSQL() {
			return fechaNacimientoSQL;
		}
		public void setFechaNacimientoSQL(Date birthSQL) {
			this.fechaNacimientoSQL = birthSQL;
		}
		

}
