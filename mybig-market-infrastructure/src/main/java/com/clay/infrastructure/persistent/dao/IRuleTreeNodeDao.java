package com.clay.infrastructure.persistent.dao;

import com.clay.infrastructure.persistent.po.RuleTreeNode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description 规则树节点表DAO
 */
@Mapper
public interface IRuleTreeNodeDao {

    List<RuleTreeNode> queryRuleTreeNodeListByTreeId(String treeId);

}
