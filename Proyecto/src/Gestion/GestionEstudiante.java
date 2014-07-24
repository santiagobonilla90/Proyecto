/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion;

import CapaDatos.Conexion;
import Clases.Estudiante;
import java.sql.SQLException;

/**
 *
 * @author santiago
 */
public class GestionEstudiante implements IGestion {
    
    private Estudiante estudiante= new Estudiante (0,"","","","","",0);

    public GestionEstudiante() {
        Conexion.setCadena("jdbc:db2://localhost:50000/INSEDUCA");
        Conexion.setUsuario("db2admin");
        Conexion.setClave("db2admin");
        
    }

     public Estudiante getEstudiante() {
        return estudiante;
    }
    public void setEstudiante (Estudiante estudiante){
        this.estudiante=estudiante;
    }

    @Override
    public void Guardar() throws SQLException {
        try{
        Conexion.GetInstancia().Conectar();
        Conexion.GetInstancia().Ejecutar("insert into Estudiante (IdEstudiante,Cedula, Nombre, Apellido, Telefono, Direccion, Estado) "
                + "values ('"+estudiante.getIdEstudiante()+estudiante.getCedula()+estudiante.getNombre()+estudiante.getApellido()+estudiante.getTelefono()+estudiante.getDireccion()+estudiante.Estado()+")");
        Conexion.GetInstancia().Desconectar();    
        }
        catch(SQLException ex){
            throw ex;            
        }
    }

    @Override
    public void Modificar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Nuevo() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Consultar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
