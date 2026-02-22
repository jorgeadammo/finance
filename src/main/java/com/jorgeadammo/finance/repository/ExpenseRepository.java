package com.jorgeadammo.finance.repository;

import com.jorgeadammo.finance.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
