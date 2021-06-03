package Adapters;
import java.rmi.RemoteException;
import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) throws RemoteException {
        KPSPublicSoapProxy client = new KPSPublicSoapProxy();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
    }
}
