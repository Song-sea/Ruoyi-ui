package com.ruoyi.stock.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.stock.mapper.StockQuoteMapper;
import com.ruoyi.stock.domain.StockQuote;
import com.ruoyi.stock.service.IStockQuoteService;

/**
 * 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块Service业务层处理
 * 
 * @author ls
 * @date 2025-09-02
 */
@Service
public class StockQuoteServiceImpl implements IStockQuoteService 
{
    @Autowired
    private StockQuoteMapper stockQuoteMapper;

    /**
     * 查询股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     * 
     * @param quoteId 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块主键
     * @return 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     */
    @Override
    public StockQuote selectStockQuoteByQuoteId(Long quoteId)
    {
        return stockQuoteMapper.selectStockQuoteByQuoteId(quoteId);
    }

    /**
     * 查询股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块列表
     * 
     * @param stockQuote 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     * @return 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     */
    @Override
    public List<StockQuote> selectStockQuoteList(StockQuote stockQuote)
    {
        return stockQuoteMapper.selectStockQuoteList(stockQuote);
    }

    /**
     * 新增股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     * 
     * @param stockQuote 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     * @return 结果
     */
    @Override
    public int insertStockQuote(StockQuote stockQuote)
    {
        return stockQuoteMapper.insertStockQuote(stockQuote);
    }

    /**
     * 修改股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     * 
     * @param stockQuote 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     * @return 结果
     */
    @Override
    public int updateStockQuote(StockQuote stockQuote)
    {
        stockQuote.setUpdateTime(DateUtils.getNowDate());
        return stockQuoteMapper.updateStockQuote(stockQuote);
    }

    /**
     * 批量删除股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     * 
     * @param quoteIds 需要删除的股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块主键
     * @return 结果
     */
    @Override
    public int deleteStockQuoteByQuoteIds(Long[] quoteIds)
    {
        return stockQuoteMapper.deleteStockQuoteByQuoteIds(quoteIds);
    }

    /**
     * 删除股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块信息
     * 
     * @param quoteId 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块主键
     * @return 结果
     */
    @Override
    public int deleteStockQuoteByQuoteId(Long quoteId)
    {
        return stockQuoteMapper.deleteStockQuoteByQuoteId(quoteId);
    }
}
