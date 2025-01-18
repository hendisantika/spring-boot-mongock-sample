package id.my.hendisantika.mongock.customer;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mongock-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/01/25
 * Time: 05.55
 * To change this template use File | Settings | File Templates.
 */
@Log4j2
@RestController
@RequestMapping(path = "/")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
}
