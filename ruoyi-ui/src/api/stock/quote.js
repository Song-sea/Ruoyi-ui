import request from '@/utils/request'

// 查询股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块列表
export function listQuote(query) {
  return request({
    url: '/stock/quote/list',
    method: 'get',
    params: query
  })
}

// 查询股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块详细
export function getQuote(quoteId) {
  return request({
    url: '/stock/quote/' + quoteId,
    method: 'get'
  })
}

// 新增股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
export function addQuote(data) {
  return request({
    url: '/stock/quote',
    method: 'post',
    data: data
  })
}

// 修改股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
export function updateQuote(data) {
  return request({
    url: '/stock/quote',
    method: 'put',
    data: data
  })
}

// 删除股票行情：存储指数、个股的实时行情数据，支撑文档“行情中心”模块
export function delQuote(quoteId) {
  return request({
    url: '/stock/quote/' + quoteId,
    method: 'delete'
  })
}
