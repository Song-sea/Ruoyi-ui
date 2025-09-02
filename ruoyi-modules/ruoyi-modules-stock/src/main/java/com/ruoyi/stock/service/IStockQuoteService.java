package com.ruoyi.stock.service;

import java.util.List;
import com.ruoyi.stock.domain.StockQuote;

/**
 * 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块Service接口
 * 
 * @author ls
 * @date 2025-09-02
 */
public interface IStockQuoteService 
{
    /**
     * 查询股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     * 
     * @param quoteId 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块主键
     * @return 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     */
    public StockQuote selectStockQuoteByQuoteId(Long quoteId);

    /**
     * 查询股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块列表
     * 
     * @param stockQuote 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     * @return 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块集合
     */
    public List<StockQuote> selectStockQuoteList(StockQuote stockQuote);

    /**
     * 新增股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     * 
     * @param stockQuote 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     * @return 结果
     */
    public int insertStockQuote(StockQuote stockQuote);

    /**
     * 修改股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     * 
     * @param stockQuote 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     * @return 结果
     */
    public int updateStockQuote(StockQuote stockQuote);

    /**
     * 批量删除股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     * 
     * @param quoteIds 需要删除的股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块主键集合
     * @return 结果
     */
    public int deleteStockQuoteByQuoteIds(Long[] quoteIds);

    /**
     * 删除股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块信息
     * 
     * @param quoteId 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块主键
     * @return 结果
     */
    public int deleteStockQuoteByQuoteId(Long quoteId);
}
