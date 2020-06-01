package com.emersysrd.emerduty.service.impl;

import java.util.List;

import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emersysrd.emerduty.mapper.ContactsGroupsMapper;
import com.emersysrd.emerduty.domain.ContactsGroups;
import com.emersysrd.emerduty.service.IContactsGroupsService;

/**
 * 通讯录分组Service业务层处理
 *
 * @author kim
 * @date 2020-05-28
 */
@Service
public class ContactsGroupsServiceImpl implements IContactsGroupsService
{
    @Autowired
    private ContactsGroupsMapper contactsGroupsMapper;

    /**
     * 查询通讯录分组
     *
     * @param groupId 通讯录分组ID
     * @return 通讯录分组
     */
    @Override
    public ContactsGroups selectContactsGroupsById(Long groupId)
    {
        return contactsGroupsMapper.selectContactsGroupsById(groupId);
    }

    /**
     * 查询通讯录分组列表
     *
     * @param contactsGroups 通讯录分组
     * @return 通讯录分组
     */
    @Override
    public List<ContactsGroups> selectContactsGroupsList(ContactsGroups contactsGroups)
    {
        return contactsGroupsMapper.selectContactsGroupsList(contactsGroups);
    }

    /**
     * 新增通讯录分组
     *
     * @param contactsGroups 通讯录分组
     * @return 结果
     */
    @Override
    public int insertContactsGroups(ContactsGroups contactsGroups)
    {
        contactsGroups.setCreateTime(DateUtils.getNowDate());
        return contactsGroupsMapper.insertContactsGroups(contactsGroups);
    }

    /**
     * 修改通讯录分组
     *
     * @param contactsGroups 通讯录分组
     * @return 结果
     */
    @Override
    public int updateContactsGroups(ContactsGroups contactsGroups)
    {
        contactsGroups.setUpdateTime(DateUtils.getNowDate());
        return contactsGroupsMapper.updateContactsGroups(contactsGroups);
    }

    /**
     * 批量删除通讯录分组
     *
     * @param groupIds 需要删除的通讯录分组ID
     * @return 结果
     */
    @Override
    public int deleteContactsGroupsByIds(Long[] groupIds)
    {
        return contactsGroupsMapper.deleteContactsGroupsByIds(groupIds);
    }

    /**
     * 删除通讯录分组信息
     *
     * @param groupId 通讯录分组ID
     * @return 结果
     */
    @Override
    public int deleteContactsGroupsById(Long groupId)
    {
        return contactsGroupsMapper.deleteContactsGroupsById(groupId);
    }

    /**
     * 查询分组是否存在成员
     *
     * @param groupIds 分组ID
     * @return 结果 true 存在 false 不存在
     */
    @Override
    public boolean checkGroupExistMembers(Long[] groupIds)
    {
        int result = contactsGroupsMapper.checkGroupExistMembers(groupIds);
        return result > 0 ? true : false;
    }
}
