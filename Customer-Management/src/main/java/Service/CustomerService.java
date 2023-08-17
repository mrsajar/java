package Service;

import Entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    public Customer addCustomer(Customer customer);

    public List<Customer> getAll();

    public Customer getById(Long id);

    public Customer update(Customer customer, Long id);

    public void delete(Long id);
}
