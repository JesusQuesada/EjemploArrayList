
package ejemploarraylist;

public class EjemploArrayList {

    public static void main(String[] args) {
        Numeros obj = new Numeros();
        obj.cargarArray();
        obj.añadirElemento();
        obj.amosar();
        obj.buscarElemento('c');
        obj.amosarElemento();
        //obj.borrarElemento();
        obj.borrarLista();
        obj.amosar();
        obj.comprobarBorrado();
        
    }
    
}
