package id.my.hendisantika.mongock.customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

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
@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
