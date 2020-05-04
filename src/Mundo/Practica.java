package Mundo;

import static Interfaz.ConfirmarCompra.jLabel40;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.awt.List;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.text.Document;

/**
 * @author aleja
 */

public class Practica {
    
        //-- Conexion --//
    DB BaseDatos;
    DBCollection Coleccion;
    BasicDBObject document = new BasicDBObject();
    
    public Practica ( ){
        //-- Conexion --//
        try {
            MongoClient mongo = new MongoClient("localhost", 27017);
            BaseDatos = mongo.getDB("Practica");
            Coleccion = BaseDatos.getCollection("Nombre");
            
        }catch (UnknownHostException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.getMessage());
        }
        
        
    }
    
    public void registro ( ){ 
        try {
            String [] b = {"parc1","parce2"};
            String [] c = {"parc3"};
            String [] nombres = new String [2];
            for (int i = 0; i < 2; i++) {
                nombres[i] = "asd";
            }

            document.put("sss", b);

            Coleccion.insert(document);
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de registro" + e.getMessage());
        } 
    }
    
        public void consultaUsuario ( ){
        
        String nombre = "a";
        
        DBCursor cursor;
        DBObject query = new BasicDBObject("asd", new BasicDBObject("$regex", nombre));
        cursor = Coleccion.find(query);
        
        try {
	while (cursor.hasNext()) {
            System.out.println(cursor.next());
	}
        }finally {
                cursor.close();
        }
    }
    
    public static void main(String args[]) {
        Practica a = new Practica();
        a.consultaUsuario();
    }
    
}
