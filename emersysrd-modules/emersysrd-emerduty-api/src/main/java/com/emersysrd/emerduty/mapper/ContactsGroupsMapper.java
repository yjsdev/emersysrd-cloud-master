package com.emersysrd.emerduty.mapper;

import java.util.List;
import com.emersysrd.emerduty.domain.ContactsGroups;

/**
 * 通讯录分组Mapper接口
 * 
 * @author kim
 * @date 2020-05-28
 */
public interface ContactsGroupsMapper 
{
    /**
     * 查询通讯录分组
     * 
     * @param groupId 通讯录分组ID
     * @return 通讯录分组
     */
    public ContactsGroups selectContactsGroupsById(Long groupId);

    /**
     * 查询通讯录分组列表
     * 
     * @param contactsGroups 通讯录分组
     * @return 通讯录分组集合
     */
    public List<ContactsGroups> selectContactsGroupsList(ContactsGroups contactsGroups);

    /**
     * 新增通讯录分组
     * 
     * @param contactsGroups 通讯录分组
     * @return 结果
     */
    public int insertContactsGroups(ContactsGroups contactsGroups);

    /**
     * 修改通讯录分组
     * 
     * @param contactsGroups 通讯录分组
     * @return 结果
     */
    public int updateContactsGroups(ContactsGroups contactsGroups);

    /**
     * 删除通讯录分组
     * 
     * @param groupId 通讯录分组ID
     * @return 结果
     */
    public int deleteContactsGroupsById(Long groupId);

    /**
     * 批量删除通讯录分组
     * 
     * @param groupIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteContactsGroupsByIds(Long[] groupIds);
}
