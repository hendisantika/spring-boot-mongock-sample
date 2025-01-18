package id.my.hendisantika.mongock.migration;

import io.mongock.api.annotations.ChangeUnit;
import lombok.extern.log4j.Log4j2;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mongock-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/01/25
 * Time: 05.57
 * To change this template use File | Settings | File Templates.
 */
@Log4j2
@ChangeUnit(id = "customer-initializer", order = "001", author = "myself")
public class CustomerInitialization {
}
