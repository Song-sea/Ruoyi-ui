package com.ruoyi.stock.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.stock.domain.StockQuote;
import com.ruoyi.stock.service.IStockQuoteService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块Controller
 * 
 * @author ls
 * @date 2025-09-02
 */
@RestController
@RequestMapping("/quote")
public class StockQuoteController extends BaseController
{
    @Autowired
    private IStockQuoteService stockQuoteService;

    /**
     * 查询股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块列表
     */
    @RequiresPermissions("stock:quote:list")
    @GetMapping("/list")
    public TableDataInfo list(StockQuote stockQuote)
    {
        startPage();
        List<StockQuote> list = stockQuoteService.selectStockQuoteList(stockQuote);
        return getDataTable(list);
    }

    /**
     * 导出股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块列表
     */
    @RequiresPermissions("stock:quote:export")
    @Log(title = "股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StockQuote stockQuote)
    {
        List<StockQuote> list = stockQuoteService.selectStockQuoteList(stockQuote);
        ExcelUtil<StockQuote> util = new ExcelUtil<StockQuote>(StockQuote.class);
        util.exportExcel(response, list, "股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块数据");
    }

    /**
     * 获取股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块详细信息
     */
    @RequiresPermissions("stock:quote:query")
    @GetMapping(value = "/{quoteId}")
    public AjaxResult getInfo(@PathVariable("quoteId") Long quoteId)
    {
        return success(stockQuoteService.selectStockQuoteByQuoteId(quoteId));
    }

    /**
     * 新增股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     */
    @RequiresPermissions("stock:quote:add")
    @Log(title = "股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StockQuote stockQuote)
    {
        return toAjax(stockQuoteService.insertStockQuote(stockQuote));
    }

    /**
     * 修改股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     */
    @RequiresPermissions("stock:quote:edit")
    @Log(title = "股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StockQuote stockQuote)
    {
        return toAjax(stockQuoteService.updateStockQuote(stockQuote));
    }

    /**
     * 删除股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
     */
    @RequiresPermissions("stock:quote:remove")
    @Log(title = "股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块", businessType = BusinessType.DELETE)
	@DeleteMapping("/{quoteIds}")
    public AjaxResult remove(@PathVariable Long[] quoteIds)
    {
        return toAjax(stockQuoteService.deleteStockQuoteByQuoteIds(quoteIds));
    }
}
