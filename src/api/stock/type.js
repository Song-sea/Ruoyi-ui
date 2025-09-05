import request from '@/utils/request'

// 查询股票类型列表
export function listType(query) {
  return request({
    url: '/stock/type/list',
    method: 'get',
    params: query
  })
}

// 查询股票类型详细
export function getType(typeId) {
  return request({
    url: '/stock/type/' + typeId,
    method: 'get'
  })
}

// 新增股票类型
export function addType(data) {
  return request({
    url: '/stock/type',
    method: 'post',
    data: data
  })
}

// 修改股票类型
export function updateType(data) {
  return request({
    url: '/stock/type',
    method: 'put',
    data: data
  })
}

// 删除股票类型
export function delType(typeId) {
  return request({
    url: '/stock/type/' + typeId,
    method: 'delete'
  })
}
