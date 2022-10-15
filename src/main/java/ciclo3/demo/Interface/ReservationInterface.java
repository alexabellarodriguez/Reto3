
package ciclo3.demo.Interface;



import ciclo3.demo.Modelo.Reservation;
import org.springframework.data.repository.CrudRepository;


public interface ReservationInterface extends CrudRepository<Reservation,Integer>{
    
}
