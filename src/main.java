
import conexion.Conexion;
import dao.FiltroDao;
import java.util.ArrayList;
import modelo.Filtro;
import vista.Consulta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UCA
 */
public class main {
    public static void main(String[] args) {

//        FiltroDao filtro= new FiltroDao();
       /* filtro.create(new Filtro("1", "Chayote", 4, true));
        filtro.create( new Filtro("2", "Pasty", 0, false));
        filtro.create(new Filtro("3", "keks", 69, true));*/
//        //filtro.readAll();
        //filtro.create(new Filtro("PT420", "ño", 6, false));
//        Filtro prueba=filtro.read("2");
//        System.out.println(prueba.toString());
//        ArrayList<Filtro> lista = filtro.readAll();
//////        
//        for(Filtro f : lista)
//        {
//           System.out.println(f.toString());
//        }
         new Consulta().setVisible(true);
    }
}
