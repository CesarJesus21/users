package mx.com.jcesar.user.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Setter
@Getter
@Entity
@Table(name = "users_roles", uniqueConstraints=
        @UniqueConstraint(columnNames={"id_user", "id_role"}))
@Polymorphism(type = PolymorphismType.EXPLICIT)
public class UserRoleEntity extends BaseEntity {

    @JoinColumn(name = "id_user", nullable = false, referencedColumnName = "id")
    @ManyToOne(optional = false)
    private UserEntity idUser;

    @JoinColumn(name = "id_role", nullable = false, referencedColumnName = "id")
    @ManyToOne(optional = false)
    private RoleEntity idRole;

}
