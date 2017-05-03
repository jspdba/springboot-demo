package com.wuchaofei.springboot.service;

import com.wuchaofei.springboot.entity.Account;

import java.util.List;

/**
 * Created by cofco on 2017/5/3.
 */
public interface IAccountService {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
