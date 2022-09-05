package BackendSecurity.Ciclo4.Grupo2.MainSecurityCiclo4.repositorios;
import BackendSecurity.Ciclo4.Grupo2.MainSecurityCiclo4.modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioRol extends MongoRepository<Rol, String> {
}
