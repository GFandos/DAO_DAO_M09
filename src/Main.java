/**
 * Created by 47989768s on 19/04/17.
 */
public class Main {

    public static void main(String args[]) {

        DaoImp dao = new DaoImp("localhost", "admin", "admin");
        dao.initDB();

        dao.create("EmpresaCollection");
        dao.insert("EmpresaCollection", "Catalogos");
        dao.insert("EmpresaCollection", "Clientes");
        dao.insert("EmpresaCollection", "Empleados");
        dao.insert("EmpresaCollection", "Facturas");


    }

}
