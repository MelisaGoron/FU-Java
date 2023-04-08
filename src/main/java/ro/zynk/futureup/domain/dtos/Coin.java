package ro.zynk.futureup.domain.dtos;

import ro.zynk.futureup.controllers.responses.CoinResponse;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin extends BaseEntity {

    @Column
    private String name;

    @Column
    private Double value;

//    @OneToOne(mappedBy = "coin", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private TransactionHistory transactionHistory;
    public Coin() {
    }

    public Coin(CoinResponse coin) {
        this.name = coin.getName();
        this.value = coin.getValue();
    }

    public Coin(String name, Double value) {
        this.name = name;
        this.value = value;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
