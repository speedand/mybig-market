package com.clay.infrastructure.persistent.dao;

import com.clay.infrastructure.persistent.po.RuleTree;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description 规则树表DAO
 */
@Mapper
public interface IRuleTreeDao {

    RuleTree queryRuleTreeByTreeId(String treeId);

}
