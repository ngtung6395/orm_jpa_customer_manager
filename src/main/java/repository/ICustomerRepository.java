package repository;

import model.Customer;

public interface ICustomerRepository extends IRepository<Customer> {
    boolean insertWithStoredProcedure(Customer customer);
}
