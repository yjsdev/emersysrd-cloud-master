package com.emersysrd.emerduty.domain;

import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 通讯录分组对象 contacts_groups
 *
 * @author kim
 * @date 2020-05-28
 */
public class ContactsGroups extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 分组id */
    @Excel(name = "分组id")
    private Long groupId;

    /** 分组名称 */
    @Excel(name = "分组名称")
    private String groupName;

    /** 分组类别 */
    @Excel(name = "分组类别")
    private String groupType;

    /** 显示顺序 */
    @Excel(name = "显示顺序")
    private Integer orderNum;

    /** 乐观锁 */
    @Excel(name = "乐观锁")
    private Long revision;

    /** 分组状态 （0正常 1停用） */
    @Excel(name = "分组状态 ", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志 （0代表存在 2代表删除） */
    @Excel(name = "删除标志 ", readConverterExp = "0=代表存在,2=代表删除")
    private String delFlag;

    public void setGroupId(Long groupId)
    {
        this.groupId = groupId;
    }

    public Long getGroupId()
    {
        return groupId;
    }
    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }

    public String getGroupName()
    {
        return groupName;
    }
    public void setGroupType(String groupType)
    {
        this.groupType = groupType;
    }

    public String getGroupType()
    {
        return groupType;
    }
    public void setOrderNum(Integer orderNum)
    {
        this.orderNum = orderNum;
    }

    public Integer getOrderNum()
    {
        return orderNum;
    }
    public void setRevision(Long revision)
    {
        this.revision = revision;
    }

    public Long getRevision()
    {
        return revision;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setDelFlag(String delFlag)
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag()
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("groupId", getGroupId())
            .append("groupName", getGroupName())
            .append("groupType", getGroupType())
            .append("orderNum", getOrderNum())
            .append("revision", getRevision())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
