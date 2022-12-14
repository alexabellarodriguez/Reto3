
package ciclo3.demo.Repositorio;

import ciclo3.demo.Interface.ReservationInterface;
import ciclo3.demo.Modelo.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepository {
     @Autowired
    private ReservationInterface extensionesCrud;

    public List<Reservation> getAll() {
        return (List<Reservation>) extensionesCrud.findAll();
    }

    public Optional<Reservation> getReservation(int id) {
        return extensionesCrud.findById(id);
    }
    public Reservation save(Reservation reservation){
        return extensionesCrud.save(reservation);
    }
}