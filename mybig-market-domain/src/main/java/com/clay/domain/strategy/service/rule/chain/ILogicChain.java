package com.clay.domain.strategy.service.rule.chain;


import com.clay.domain.strategy.service.rule.chain.factory.DefaultChainFactory;

/**
 * @description 抽奖策略规则责任链接口
 */
public interface ILogicChain extends ILogicChainArmory, Cloneable{

    /**
     * 责任链接口
     *
     * @param userId     用户ID
     * @param strategyId 策略ID
     * @return 奖品ID
     */
    DefaultChainFactory.StrategyAwardVO logic(String userId, Long strategyId);

}
