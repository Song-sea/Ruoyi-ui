package com.ruoyi.stock.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块对象 stock_quote
 * 
 * @author ls
 * @date 2025-09-02
 */
public class StockQuote extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 行情记录唯一标识（自增主键，无依赖） */
    private Long quoteId;

    /** 股票类型：区分指数个股，如“上证指数”“深证成指”“沪深A股”（对应文档行情中心“频道”分类） */
    @Excel(name = "股票类型：区分指数个股，如“上证指数”“深证成指”“沪深A股”", readConverterExp = "对=应文档行情中心“频道”分类")
    private String stockType;

    /** 股票代码：如“SZ002699”“SH000001”，唯一标识单只股票指数（文档行情中心个股展示字段） */
    @Excel(name = "股票代码：如“SZ002699”“SH000001”，唯一标识单只股票指数", readConverterExp = "文=档行情中心个股展示字段")
    private String stockCode;

    /** 股票名称：如“上证指数”“美盛文化”“中信重工”（文档行情中心核心展示字段） */
    @Excel(name = "股票名称：如“上证指数”“美盛文化”“中信重工”", readConverterExp = "文=档行情中心核心展示字段")
    private String stockName;

    /** 最新价格：如3630.50、50.21（文档行情中心“最新价”列数据） */
    @Excel(name = "最新价格：如3630.50、50.21", readConverterExp = "文=档行情中心“最新价”列数据")
    private BigDecimal latestPrice;

    /** 涨跌额：正数为涨、负数为跌，如+13.44、-2.15（文档行情中心“+13.44”类数据） */
    @Excel(name = "涨跌额：正数为涨、负数为跌，如+13.44、-2.15", readConverterExp = "文=档行情中心“+13.44”类数据")
    private BigDecimal riseFallAmt;

    /** 涨跌幅：百分比格式，如+0.37、-1.25（文档行情中心“+0.37%”类数据，存储时不含百分号） */
    @Excel(name = "涨跌幅：百分比格式，如+0.37、-1.25", readConverterExp = "文=档行情中心“+0.37%”类数据，存储时不含百分号")
    private BigDecimal riseFallRate;

    /** 成交额：如3200000000（32亿）、2800000000（28亿），文档行情中心“金额”列数据（允许为NULL，部分行情可能不展示） */
    @Excel(name = "成交额：如3200000000", readConverterExp = "3=2亿")
    private Long tradeVolume;

    public void setQuoteId(Long quoteId) 
    {
        this.quoteId = quoteId;
    }

    public Long getQuoteId() 
    {
        return quoteId;
    }

    public void setStockType(String stockType) 
    {
        this.stockType = stockType;
    }

    public String getStockType() 
    {
        return stockType;
    }

    public void setStockCode(String stockCode) 
    {
        this.stockCode = stockCode;
    }

    public String getStockCode() 
    {
        return stockCode;
    }

    public void setStockName(String stockName) 
    {
        this.stockName = stockName;
    }

    public String getStockName() 
    {
        return stockName;
    }

    public void setLatestPrice(BigDecimal latestPrice) 
    {
        this.latestPrice = latestPrice;
    }

    public BigDecimal getLatestPrice() 
    {
        return latestPrice;
    }

    public void setRiseFallAmt(BigDecimal riseFallAmt) 
    {
        this.riseFallAmt = riseFallAmt;
    }

    public BigDecimal getRiseFallAmt() 
    {
        return riseFallAmt;
    }

    public void setRiseFallRate(BigDecimal riseFallRate) 
    {
        this.riseFallRate = riseFallRate;
    }

    public BigDecimal getRiseFallRate() 
    {
        return riseFallRate;
    }

    public void setTradeVolume(Long tradeVolume) 
    {
        this.tradeVolume = tradeVolume;
    }

    public Long getTradeVolume() 
    {
        return tradeVolume;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("quoteId", getQuoteId())
            .append("stockType", getStockType())
            .append("stockCode", getStockCode())
            .append("stockName", getStockName())
            .append("latestPrice", getLatestPrice())
            .append("riseFallAmt", getRiseFallAmt())
            .append("riseFallRate", getRiseFallRate())
            .append("tradeVolume", getTradeVolume())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
