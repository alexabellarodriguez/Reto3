
package ciclo3.demo.Controlador;



import ciclo3.demo.Modelo.Partyroom;
import ciclo3.demo.Servicio.PartyroomService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Partyroom")
public class PartyroomController {
    @Autowired
    private PartyroomService  partyroomService;
    @GetMapping("/all")
    public List<Partyroom> getAll(){
        return partyroomService.getAll();
        }
    @GetMapping("/{id}")
    public Optional<Partyroom> getPartyroom(@PathVariable("id")int id){
        return partyroomService.getPartyroom(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Partyroom save(@RequestBody Partyroom partyroom){
        return partyroomService.save(partyroom);
    }
}

