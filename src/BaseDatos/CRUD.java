
package BaseDatos;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CRUD {
    
    public ArrayList listar() throws Exception;
    public int crear(Object Object) throws SQLException;
    public void actualizar(int id, Object object) throws Exception;
    public void eliminar(int id) throws Exception;
    public Object get(int id )throws Exception;
}
