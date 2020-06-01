package com.emersysrd.emerduty.mapper;

import java.util.List;
import com.emersysrd.emerduty.domain.ContactsGroupMembers;

/**
 * 通讯录成员Mapper接口
 * 
 * @author kim
 * @date 2020-05-29
 */
public interface ContactsGroupMembersMapper 
{
    /**
     * 查询通讯录成员
     * 
     * @param memberId 通讯录成员ID
     * @return 通讯录成员
     */
    public ContactsGroupMembers selectContactsGroupMembersById(Long memberId);

    /**
     * 查询通讯录成员列表
     * 
     * @param contactsGroupMembers 通讯录成员
     * @return 通讯录成员集合
     */
    public List<ContactsGroupMembers> selectContactsGroupMembersList(ContactsGroupMembers contactsGroupMembers);

    /**
     * 新增通讯录成员
     * 
     * @param contactsGroupMembers 通讯录成员
     * @return 结果
     */
    public int insertContactsGroupMembers(ContactsGroupMembers contactsGroupMembers);

    /**
     * 修改通讯录成员
     * 
     * @param contactsGroupMembers 通讯录成员
     * @return 结果
     */
    public int updateContactsGroupMembers(ContactsGroupMembers contactsGroupMembers);

    /**
     * 删除通讯录成员
     * 
     * @param memberId 通讯录成员ID
     * @return 结果
     */
    public int deleteContactsGroupMembersById(Long memberId);

    /**
     * 批量删除通讯录成员
     * 
     * @param memberIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteContactsGroupMembersByIds(Long[] memberIds);
}
