package com.clay.domain.strategy.repository;

import com.clay.domain.strategy.model.entity.StrategyAwardEntity;
import com.clay.domain.strategy.model.entity.StrategyEntity;
import com.clay.domain.strategy.model.entity.StrategyRuleEntity;

import java.util.List;
import java.util.Map;

/**
 * @description 策略服务仓储接口
 */
public interface IStrategyRepository {

    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(String key, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    Integer getStrategyAwardAssemble(String key, Integer rateKey);

    int getRateRange(Long strategyId);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleModel);

    int getRateRange(String key);

    String queryStrategyRuleValue(Long strategyId, Integer awardId, String ruleModel);
}
