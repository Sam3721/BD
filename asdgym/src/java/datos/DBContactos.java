/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

    import java.sql.*;
    import logica.Cliente;
/**
 *
 * @author Estudiantes
 */
public class DBContactos {
    DBConexion cn;
    
    public DBContactos() {
        cn = new DBConexion();
    }

    public ResultSet getClienteById(int id) throws SQLException {
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT con_id, "
                + " con_nombre, "
                + " con_peso, "
                + " con_altura, "
                + " con_edad,"
                + " con_objetivo, "
                + " con_dias, "
                + " FROM clientes "
                + " WHERE con_id = ? ");
        pstm.setInt(1, id);

        ResultSet res = pstm.executeQuery();
        /*
         res.close();	
         */

        return res;
    }

    /**
     * trae todos los registros de la tabla contactos
     */
    public ResultSet getClientes() throws SQLException {
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT con_id, "
                + " con_nombre, "
                + " con_apellido, "
                + " con_telefono_domicilio, "
                + " con_telefono_oficina,"
                + " con_celular, "
                + " con_correo, "
                + " con_direccion_residencia,"
                + " con_direccion_trabajo "
                + " FROM contactos "
                + " ORDER BY con_nombre, con_apellido ");


        ResultSet res = pstm.executeQuery();
        return res;
    }

    public void insertarCliente(Cliente c) {
        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("insert into clientes (con_nombre, "
                    + " con_apellido,"
                    + " con_telefono_domicilio,"
                    + " con_telefono_oficina,"
                    + " con_celular,"
                    + " con_correo,"
                    + " con_direccion_residencia,"
                    + " con_direccion_trabajo) "
                    + " values(?,?,?,?,?,?,?,?)");
            pstm.setString(1, c.getNombre());
            pstm.setString(2, c.getPeso());
            pstm.setString(3, c.getAltura());
            pstm.setString(4, c.getEdad());
            pstm.setInt(5, c.getObjetivo());
            pstm.setInt(6, c.getDias());

            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void actualizarCliente(Cliente c) {

        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("update clientes set con_nombre = ?, "
                    + " con_apellido = ?,"
                    + " con_telefono_domicilio = ?,"
                    + " con_telefono_oficina = ?,"
                    + " con_celular = ?,"
                    + " con_correo = ?,"
                    + " con_direccion_residencia = ?,"
                    + " con_direccion_trabajo = ? "
                    + " where con_id = ?");
            pstm.setString(1, c.getNombre());
            pstm.setString(2, c.getPeso());
            pstm.setString(3, c.getAltura());
            pstm.setString(4, c.getEdad());
            pstm.setInt(5, c.getObjetivo());
            pstm.setInt(6, c.getDias());
            pstm.setInt(9, c.getId());

            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void borrarCliente(Cliente c) {

        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("delete from clientes "
                    + " where con_id = ?");

            pstm.setInt(1, c.getId());

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }


    }

    public String getMensaje() {
        return cn.getMensaje();
    }
}
