
package ciclo3.demo.Repositorio;


import ciclo3.demo.Interface.MessageInterface;
import ciclo3.demo.Modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
     @Autowired
    private MessageInterface extensionesCrud;

    public List<Message> getAll() {
        return (List<Message>) extensionesCrud.findAll();
    }

    public Optional<Message> getMessage(int id) {
        return extensionesCrud.findById(id);
    }
    public Message save(Message message){
        return extensionesCrud.save(message);
    }
}