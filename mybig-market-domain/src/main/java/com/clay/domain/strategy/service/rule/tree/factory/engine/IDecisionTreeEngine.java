package com.clay.domain.strategy.service.rule.tree.factory.engine;

import com.clay.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @description 规则树组合接口
 */
public interface IDecisionTreeEngine {

    DefaultTreeFactory.StrategyAwardData process(String userId, Long strategyId, Integer awardId);

}
