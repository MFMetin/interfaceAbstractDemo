package Abstract;

import Entities.Customer;

import java.rmi.RemoteException;

public interface ICustomerCheckService {
    boolean checkIfRealPerson(Customer customer) throws RemoteException;
}
