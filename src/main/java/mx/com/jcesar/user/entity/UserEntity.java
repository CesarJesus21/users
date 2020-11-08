package mx.com.jcesar.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import mx.com.jcesar.user.utils.BaseEntity;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


@Entity
@Table(name = "users")
@Polymorphism(type = PolymorphismType.EXPLICIT)
public class UserEntity extends BaseEntity {

    @Column(unique = true, nullable = false)
    @Size(min = 8, max = 255)
    @Setter
    @Getter
    private String name;

    @Column(nullable = false)
    @Size(min = 8, max = 255)
    private String password;

    @Column(unique = true, nullable = false)
    @Size(min = 10, max = 255)
    @Email
    @Setter
    @Getter
    private String email;

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }
}
