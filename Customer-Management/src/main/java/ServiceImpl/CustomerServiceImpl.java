package ServiceImpl;

import CustomException.CustomException;
import Entity.Customer;
import Repository.CustomerRepository;
import Service.CustomerService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer customer) {
        try {
            return customerRepository.save(customer);
        } catch (Exception e) {
            throw new CustomException("some error with adding customer"+e);
        }
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<Customer>();
        customerRepository.findAll().forEach(loop -> customers.add(loop));
        return customers;
    }

    @Override
    public Customer getById(Long id) {
        Customer customer = customerRepository.findById(id).orElseThrow
                (() -> new EntityNotFoundException("customer not found with id " + id));
        return customer;
    }

    @Override
    public Customer update(Customer customer, Long id) {
        Customer findCustomer = customerRepository.findById(id).orElseThrow
                (()-> new EntityNotFoundException("customer not found with id "+id));
        findCustomer.setName(customer.getName());
        findCustomer.setEmail(customer.getEmail());
        findCustomer.setPhoneNumber(customer.getPhoneNumber());
        return customerRepository.save(findCustomer);
    }

    @Override
    public void delete(Long id) {
        Customer customer = customerRepository.findById(id).orElseThrow
                (() -> new EntityNotFoundException("customer not found with id" + id));
        customerRepository.deleteById(customer.getId());
    }

}
