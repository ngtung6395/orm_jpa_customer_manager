package service;

import model.Customer;

public interface ICustomerService extends IService<Customer> {
    boolean insertWithStoredProcedure(Customer customer);
}
