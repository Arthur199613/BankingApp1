package Bank.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@ToString

public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany
    private List<CreditCard> creditCards;

    @ManyToMany
    @JoinTable(name = "personAddress",
    joinColumns = @JoinColumn(name = "personFK"),
    inverseJoinColumns = @JoinColumn(name = "addressFK"))
    private List<Address> addresses;


}
