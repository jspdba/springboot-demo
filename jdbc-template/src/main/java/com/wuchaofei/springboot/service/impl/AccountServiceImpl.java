package com.wuchaofei.springboot.service.impl;

import com.wuchaofei.springboot.dao.IAccountDAO;
import com.wuchaofei.springboot.entity.Account;
import com.wuchaofei.springboot.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cofco on 2017/5/3.
 */
@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    IAccountDAO accountDAO;

    @Override
    public int add(Account account) {
        return accountDAO.add(account);
    }

    @Override
    public int update(Account account) {
        return accountDAO.update(account);
    }

    @Override
    public int delete(int id) {
        return accountDAO.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDAO.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDAO.findAccountList();
    }
}
