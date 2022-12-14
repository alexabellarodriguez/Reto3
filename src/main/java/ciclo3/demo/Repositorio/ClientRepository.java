
package ciclo3.demo.Repositorio;




import ciclo3.demo.Interface.ClientInterface;
import ciclo3.demo.Modelo.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepository {
     @Autowired
    private ClientInterface extensionesCrud;

    public List<Client> getAll() {
        return (List<Client>) extensionesCrud.findAll();
    }

    public Optional<Client> getClient(int id) {
        return extensionesCrud.findById(id);
    }
    public Client save(Client client){
        return extensionesCrud.save(client);
    }
}