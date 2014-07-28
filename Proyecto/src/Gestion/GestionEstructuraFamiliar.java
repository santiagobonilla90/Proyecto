/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion;

import CapaDatos.Conexion;
import Clases.EstructuraFamiliar;
import java.sql.SQLException;

/**
 * @author 
 */
public class GestionEstructuraFamiliar implements IGestion{
    
    private EstructuraFamiliar estructuraFamiliar=new EstructuraFamiliar (0,"","","","",0,"","",0);
    
    public GestionEstructuraFamiliar(){
        Conexion.setCadena("jdbc:db2://localhost:50000/INSEDUCA");
        Conexion.setUsuario("db2admin");
        Conexion.setClave("db2admin");
    }

    public EstructuraFamiliar getEstructuraFamiliar(){
        return estructuraFamiliar;
    }
    
      public void setEstructuraFamiliar (EstructuraFamiliar estructuraFamiliar){
        this.estructuraFamiliar=estructuraFamiliar;
    }
        
    @Override
    public void Guardar() throws SQLException {
         try{
        Conexion.GetInstancia().Conectar();
        Conexion.GetInstancia().Ejecutar("insert into EstructuraFamiliar (IdEstructuraFamiliar,Cedula, Nombre, Apellido, Telefono, Direccion, Estado) "
                + "values ('"+estructuraFamiliar.getIdEstructuraFamiliar()+estructuraFamiliar.getNombres()+estructuraFamiliar.getApellido()+estructuraFamiliar.getCedula()+estructuraFamiliar.getEdad()+estructuraFamiliar.getInstruccion()+estructuraFamiliar.getOcupacion()+estructuraFamiliar.getBono()+")");
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