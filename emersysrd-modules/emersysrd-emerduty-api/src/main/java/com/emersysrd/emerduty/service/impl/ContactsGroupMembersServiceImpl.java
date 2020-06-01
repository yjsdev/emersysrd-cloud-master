package com.emersysrd.emerduty.service.impl;

import java.util.List;

import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emersysrd.emerduty.mapper.ContactsGroupMembersMapper;
import com.emersysrd.emerduty.domain.ContactsGroupMembers;
import com.emersysrd.emerduty.service.IContactsGroupMembersService;

/**
 * 通讯录成员Service业务层处理
 *
 * @author kim
 * @date 2020-05-29
 */
@Service
public class ContactsGroupMembersServiceImpl implements IContactsGroupMembersService
{
    @Autowired
    private ContactsGroupMembersMapper contactsGroupMembersMapper;

    /**
     * 查询通讯录成员
     *
     * @param memberId 通讯录成员ID
     * @return 通讯录成员
     */
    @Override
    public ContactsGroupMembers selectContactsGroupMembersById(Long memberId)
    {
        return contactsGroupMembersMapper.selectContactsGroupMembersById(memberId);
    }

    /**
     * 查询通讯录成员列表
     *
     * @param contactsGroupMembers 通讯录成员
     * @return 通讯录成员
     */
    @Override
    public List<ContactsGroupMembers> selectContactsGroupMembersList(ContactsGroupMembers contactsGroupMembers)
    {
        return contactsGroupMembersMapper.selectContactsGroupMembersList(contactsGroupMembers);
    }

    /**
     * 新增通讯录成员
     *
     * @param contactsGroupMembers 通讯录成员
     * @return 结果
     */
    @Override
    public int insertContactsGroupMembers(ContactsGroupMembers contactsGroupMembers)
    {
        contactsGroupMembers.setCreateTime(DateUtils.getNowDate());
        return contactsGroupMembersMapper.insertContactsGroupMembers(contactsGroupMembers);
    }

    /**
     * 修改通讯录成员
     *
     * @param contactsGroupMembers 通讯录成员
     * @return 结果
     */
    @Override
    public int updateContactsGroupMembers(ContactsGroupMembers contactsGroupMembers)
    {
        contactsGroupMembers.setUpdateTime(DateUtils.getNowDate());
        return contactsGroupMembersMapper.updateContactsGroupMembers(contactsGroupMembers);
    }

    /**
     * 批量删除通讯录成员
     *
     * @param memberIds 需要删除的通讯录成员ID
     * @return 结果
     */
    @Override
    public int deleteContactsGroupMembersByIds(Long[] memberIds)
    {
        return contactsGroupMembersMapper.deleteContactsGroupMembersByIds(memberIds);
    }

    /**
     * 删除通讯录成员信息
     *
     * @param memberId 通讯录成员ID
     * @return 结果
     */
    @Override
    public int deleteContactsGroupMembersById(Long memberId)
    {
        return contactsGroupMembersMapper.deleteContactsGroupMembersById(memberId);
    }
}
