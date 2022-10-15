
package ciclo3.demo.Interface;


import ciclo3.demo.Modelo.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageInterface extends CrudRepository<Message, Integer>{
    
}
