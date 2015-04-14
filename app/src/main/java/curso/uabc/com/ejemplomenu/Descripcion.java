package curso.uabc.com.ejemplomenu;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by xhendor on 4/11/15.
 */
public class Descripcion implements Serializable{

 private HashMap<Integer,String> descripcion=new HashMap<>();


private Integer identificador;

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public HashMap<Integer, String> getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(HashMap<Integer, String> descripcion) {
        this.descripcion = descripcion;
    }
}
