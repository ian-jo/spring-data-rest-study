package kr.co.hasy.springdatareststudy.styler;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kr.co.hasy.springdatareststudy.shop.Shop;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Styler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @JsonIgnore
    private String hiddenString;

    @ManyToOne
    @JoinColumn(name= "shop_id")
    private Shop shop;
}
