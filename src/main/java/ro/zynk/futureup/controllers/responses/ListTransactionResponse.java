package ro.zynk.futureup.controllers.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@RequiredArgsConstructor
public class ListTransactionResponse extends BaseResponse{
    private List<TransactionHistoryResponse> transactionResponse;
    public ListTransactionResponse(List<TransactionHistoryResponse> transactionResponses) {
        this.transactionResponse = transactionResponses;
    }
}
