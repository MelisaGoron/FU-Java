package ro.zynk.futureup.domain.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ro.zynk.futureup.domain.dtos.Transaction;

import java.util.List;

@Repository
public interface TransactionHistoryRepository extends PagingAndSortingRepository<Transaction, Long> {
    List<Transaction> findAll();
    List<Transaction> findByTotalValueGreaterThan(Double totalValue);

}
