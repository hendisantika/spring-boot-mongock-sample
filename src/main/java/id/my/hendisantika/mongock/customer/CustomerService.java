package id.my.hendisantika.mongock.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mongock-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/01/25
 * Time: 05.54
 * To change this template use File | Settings | File Templates.
 */
@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public List<Customer> saveAll(String... names) {
        return Arrays.asList(names).stream()
                .map(Customer::new)
                .map(customerRepository::save)
                .toList();
    }

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
