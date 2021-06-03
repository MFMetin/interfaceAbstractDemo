import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.Save(new Customer(1,
                "Engin",
                "Demiroğ",
                LocalDate.of(1985,7,07),
                "28861499100"));
    }
}
