package service.customer;

import model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

    Optional<Customer> findById(Long id);

    void save(Customer t);

    void remove(Long id);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
