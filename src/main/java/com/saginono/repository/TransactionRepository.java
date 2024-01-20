package com.saginono.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.saginono.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
  // 쿼리 메소드
}
