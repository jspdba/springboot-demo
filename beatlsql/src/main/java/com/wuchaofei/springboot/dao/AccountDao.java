package com.wuchaofei.springboot.dao;

import com.wuchaofei.springboot.entity.Account;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;

/**
 * Created by fangzhipeng on 2017/4/20.
 */
public interface AccountDao extends BaseMapper<Account> {

    @SqlStatement(params = "name")
    Account selectAccountByName(String name);
}
