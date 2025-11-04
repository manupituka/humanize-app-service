package humanize.service.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "users")
public class UserEntity {
    private String id;
    private String name;
    private String username;
    private String password;
    private String cpf;
    private String role; // "ADMIN", "GESTANTE", "PARCEIRO", etc.
}
