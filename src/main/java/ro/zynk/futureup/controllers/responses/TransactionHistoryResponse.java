package ro.zynk.futureup.controllers.responses;

import lombok.*;
import ro.zynk.futureup.domain.dtos.Coin;
import ro.zynk.futureup.domain.dtos.Transaction;

import java.time.LocalDate;
import java.util.Date;

@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class TransactionHistoryResponse extends BaseResponse {
    private Long id;
    private LocalDate date;
    private Coin coin_id;
    private Double amount;
    private Double totalValue;

    public TransactionHistoryResponse(Transaction tr) {
        this.id = tr.getId();
        this.date = tr.getDate();
        this.coin_id = tr.getCoin_id();
        this.amount = tr.getAmount();
        this.totalValue = tr.getTotalValue();
    }

//   public TransactionHistoryResponse(Trasaction tr){
//}

//    public TransactionHistoryResponse(Transaction tr) {
//        this.id = tr.getId();
//        this.date = tr.getDate();
//        this.coin_id = tr.getCoin_id();
//        this.amount = tr.getAmount();
//        this.totalValue = tr.getTotalValue();
//    }
}
