import request from '@/utils/request'

// 查询通讯录分组列表
export function listGroups(query) {
  return request({
    url: '/emerduty/groups/list',
    method: 'get',
    params: query
  })
}

// 查询通讯录分组详细
export function getGroups(groupId) {
  return request({
    url: '/emerduty/groups/' + groupId,
    method: 'get'
  })
}

// 新增通讯录分组
export function addGroups(data) {
  return request({
    url: '/emerduty/groups',
    method: 'post',
    data: data
  })
}

// 修改通讯录分组
export function updateGroups(data) {
  return request({
    url: '/emerduty/groups',
    method: 'put',
    data: data
  })
}

// 删除通讯录分组
export function delGroups(groupId) {
  return request({
    url: '/emerduty/groups/' + groupId,
    method: 'delete'
  })
}

// 导出通讯录分组
export function exportGroups(query) {
  return request({
    url: '/emerduty/groups/export',
    method: 'get',
    params: query
  })
}