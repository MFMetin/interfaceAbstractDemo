package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
    private ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(ICustomerService customerCheckService) {
        _customerCheckService = (ICustomerCheckService) customerCheckService;
    }

    @Override
    public void Save(Customer customer)  {
       if(_customerCheckService.checkIfRealPerson(customer)){
        super.Save(customer);
       }
       else{
           throw new RuntimeException("Not a valid person.");
       }
}}
