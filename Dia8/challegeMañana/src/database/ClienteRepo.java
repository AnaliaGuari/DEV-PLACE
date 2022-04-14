package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.Cliente;

public class ClienteRepo {
	private Conection conection;

    private Connection con;
     
    public ClienteRepo(){
    	conection = new Conection();
      
    }
    
    //INSERTS
    
    public void insertClient(Cliente client)
    {
        PreparedStatement ps;
        PreparedStatement ps2;
        String sql;
    
       
        try{ //Save personal info
        	
         	Connection con = conection.getConnection();
            sql = "insert into personInfo( idInfo, nombre, apellido, dni, direccion, fechaNacimiento) values (?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, client.getId());
            ps.setString(2, client.getNombre());
            ps.setString(3, client.getApellido());
            ps.setString(4, client.getDni());
            ps.setString(5, client.getDireccion());
            ps.setDate(6, client.getFechaNacimientoSQL());
            
            ps.executeUpdate();
            
            sql = "insert into Clients( idClient, idInfo) values (?,?)";
            ps2 = con.prepareStatement(sql);
            ps2.setInt(1, client.getIdCliente());
            ps2.setInt(2, client.getId());
            
            ps2.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        
        
        
    }
    
    public void selectClients()
    {
    	Connection con = conection.getConnection();
  
    	try
    	{
    		 
 	   String sql = "select idCliente,  nombre, apellido, dni from Cliente c inner join personInfo p on c.idInfo = p.idInfo";
		   PreparedStatement stmtt =  con.prepareStatement(sql);
		   ResultSet rs = stmtt.executeQuery(sql);
		  System.out.println("CLIENTES: : ");
		   while (rs.next()) {
			
		   System.out.println("Id: " + rs.getInt("idCliente")+ ", Name: " + rs.getString("nombre") + " " + rs.getString("apellido") +", DNI: "+rs.getString("dni") );
		}
		  
		  rs.close();
	stmtt.close();
		}
		catch (Exception e) {
		  e.printStackTrace();
		}
    }
    
    public void deletePerson(int idInfo)
    {
    	Connection con = conection.getConnection();
        
    	try
    	{
    		 
 	   String sql = "Delete from personInfo where idInfo = " +idInfo +";";
		   PreparedStatement stmtt =  con.prepareStatement(sql);
		   stmtt.executeUpdate();
	

		
	stmtt.close();
		}
		catch (Exception e) {
		  e.printStackTrace();
		}
    }
    
    public void updatePerson(int idPerson, String nombre, String apellido, String dni, String direccion, Date fecha)
    {
Connection con = conection.getConnection();
        
    	try
    	{
    		 
 	   String sql = "Update personInfo  "
 	   		+ "SET nombre = ?, apellido = ?, dni = ?, direccion = ? ,fecha = ?" 
 	   		+ "where idPerson =?;";
		   PreparedStatement stmtt =  con.prepareStatement(sql);
		   
		   stmtt.setString(1, nombre);
		   stmtt.setString(2, apellido);
		   stmtt.setString(3, dni);
		   stmtt.setString(4, direccion);
		   stmtt.setDate(5, fecha);
		   stmtt.setInt(6, idPerson);
		   
		   stmtt.executeUpdate();
	

		
	stmtt.close();
		}
		catch (Exception e) {
		  e.printStackTrace();
		}
    }
    
}
