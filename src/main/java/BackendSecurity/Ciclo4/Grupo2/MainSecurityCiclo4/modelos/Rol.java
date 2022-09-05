package BackendSecurity.Ciclo4.Grupo2.MainSecurityCiclo4.modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class Rol {
    @Id
    private String _id;
    private String nombre;

    public Rol(String nombre){
        this.nombre = nombre;
    }
    public String get_id(){
        return _id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}
