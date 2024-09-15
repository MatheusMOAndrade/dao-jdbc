package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        
        Department obj = new Department(1, "Noldor's King");

        Seller seller = new Seller(3142, "Feanor", "feanor@gmail.com", new Date(), 300000.00, obj);

        System.out.println(obj);
        System.out.println(seller);

    }
}
