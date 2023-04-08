package ro.zynk.futureup.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ro.zynk.futureup.controllers.responses.TransactionHistoryResponse;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Transaction extends BaseEntity{

    @Column
    private LocalDate date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coin_id", referencedColumnName = "id")
    private Coin coin_id;

    @Column
    private Double amount;

    @Column
    private Double totalValue;

}
