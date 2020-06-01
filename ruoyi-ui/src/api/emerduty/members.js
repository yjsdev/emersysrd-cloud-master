import request from '@/utils/request'

// 查询通讯录成员列表
export function listMembers(query) {
  return request({
    url: '/emerduty/members/list',
    method: 'get',
    params: query
  })
}

// 查询通讯录成员详细
export function getMembers(memberId) {
  return request({
    url: '/emerduty/members/' + memberId,
    method: 'get'
  })
}

// 新增通讯录成员
export function addMembers(data) {
  return request({
    url: '/emerduty/members',
    method: 'post',
    data: data
  })
}

// 修改通讯录成员
export function updateMembers(data) {
  return request({
    url: '/emerduty/members',
    method: 'put',
    data: data
  })
}

// 删除通讯录成员
export function delMembers(memberId) {
  return request({
    url: '/emerduty/members/' + memberId,
    method: 'delete'
  })
}

// 导出通讯录成员
export function exportMembers(query) {
  return request({
    url: '/emerduty/members/export',
    method: 'get',
    params: query
  })
}