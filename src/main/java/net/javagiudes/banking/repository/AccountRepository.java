package net.javagiudes.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javagiudes.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
