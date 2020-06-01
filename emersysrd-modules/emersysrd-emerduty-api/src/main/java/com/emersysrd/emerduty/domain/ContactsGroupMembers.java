package com.emersysrd.emerduty.domain;

import java.util.Date;

import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 通讯录成员对象 contacts_group_members
 *
 * @author kim
 * @date 2020-05-29
 */
public class ContactsGroupMembers extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 成员ID */
    @Excel(name = "成员ID")
    private Long memberId;

    /** 成员名称 */
    @Excel(name = "成员名称")
    private String memberName;

    /** 部门ID */
    private String deptId;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptName;

    /** 岗位ID */
    private Long postId;

    /** 岗位名称 */
    @Excel(name = "岗位名称")
    private String postName;

    /** 通讯录组id */
    @Excel(name = "通讯录组id")
    private Long groupId;

    /** 成员状态 （0正常 1停用） */
    @Excel(name = "成员状态 ", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志 （0代表存在 2代表删除） */
    private String delFlag;

    /** 最后联系人 */
    private String lastcallBy;

    /** 最后联系时间 */
    private Date lastcallDate;

    /** 乐观锁 */
    private Long revision;

    public void setMemberId(Long memberId)
    {
        this.memberId = memberId;
    }

    public Long getMemberId()
    {
        return memberId;
    }
    public void setMemberName(String memberName)
    {
        this.memberName = memberName;
    }

    public String getMemberName()
    {
        return memberName;
    }
    public void setDeptId(String deptId)
    {
        this.deptId = deptId;
    }

    public String getDeptId()
    {
        return deptId;
    }
    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }

    public String getDeptName()
    {
        return deptName;
    }
    public void setPostId(Long postId)
    {
        this.postId = postId;
    }

    public Long getPostId()
    {
        return postId;
    }
    public void setPostName(String postName)
    {
        this.postName = postName;
    }

    public String getPostName()
    {
        return postName;
    }
    public void setGroupId(Long groupId)
    {
        this.groupId = groupId;
    }

    public Long getGroupId()
    {
        return groupId;
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
    public void setLastcallBy(String lastcallBy)
    {
        this.lastcallBy = lastcallBy;
    }

    public String getLastcallBy()
    {
        return lastcallBy;
    }
    public void setLastcallDate(Date lastcallDate)
    {
        this.lastcallDate = lastcallDate;
    }

    public Date getLastcallDate()
    {
        return lastcallDate;
    }
    public void setRevision(Long revision)
    {
        this.revision = revision;
    }

    public Long getRevision()
    {
        return revision;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("memberId", getMemberId())
            .append("memberName", getMemberName())
            .append("deptId", getDeptId())
            .append("deptName", getDeptName())
            .append("postId", getPostId())
            .append("postName", getPostName())
            .append("groupId", getGroupId())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("lastcallBy", getLastcallBy())
            .append("lastcallDate", getLastcallDate())
            .append("revision", getRevision())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
