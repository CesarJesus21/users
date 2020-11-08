package mx.com.jcesar.user.entity;

import lombok.Getter;
import lombok.Setter;
import mx.com.jcesar.user.utils.BaseEntity;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Setter
@Getter
@Entity
@Table(name = "roles")
@Polymorphism(type = PolymorphismType.EXPLICIT)
public class RoleEntity extends BaseEntity {

    @Column(unique = true)
    @Size(min = 5, max = 255)
    private String name;

    @Column(length = 500)
    String description;

}
