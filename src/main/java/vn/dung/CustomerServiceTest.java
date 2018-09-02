package vn.dung;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

public class CustomerServiceTest {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();

        Customer vnd = service.createCustomer(new CustomerDto("vnd"));

        System.out.println(vnd);
    }
}

@Slf4j
class CustomerService {
    //private static final Logger LOG = LoggerFactory.getLogger(CustomerService.class);

    public Customer createCustomer(CustomerDto dto) {
        Customer newCustomer = dto.toCustomer();

        // validate and create a customer

        log.info("Customer created {}", newCustomer);
        return newCustomer;
    }
}

@Data
@AllArgsConstructor
class CustomerDto {
    private String name;

    public Customer toCustomer() {
        Customer customer = new Customer();
        customer.setName(name);
        return customer;
    }
}