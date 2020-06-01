package com.emersysrd.emerduty.controller;

import java.io.IOException;
import java.util.List;

import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.emersysrd.emerduty.domain.ContactsGroupMembers;
import com.emersysrd.emerduty.service.IContactsGroupMembersService;
import javax.servlet.http.HttpServletResponse;

/**
 * 通讯录成员Controller
 *
 * @author kim
 * @date 2020-05-29
 */
@RestController
@RequestMapping("members")
public class ContactsGroupMembersController extends BaseController
{
    @Autowired
    private IContactsGroupMembersService contactsGroupMembersService;

    /**
     * 查询通讯录成员列表
     */
    @PreAuthorize("@ss.hasPermi('emerduty:members:list')")
    @GetMapping("/list")
    public TableDataInfo list(ContactsGroupMembers contactsGroupMembers)
    {
        startPage();
        List<ContactsGroupMembers> list = contactsGroupMembersService.selectContactsGroupMembersList(contactsGroupMembers);
        return getDataTable(list);
    }

    /**
     * 导出通讯录成员列表
     */
    @PreAuthorize("@ss.hasPermi('emerduty:members:export')")
    @Log(title = "通讯录成员", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public void export(HttpServletResponse response, ContactsGroupMembers contactsGroupMembers) throws IOException
    {
        List<ContactsGroupMembers> list = contactsGroupMembersService.selectContactsGroupMembersList(contactsGroupMembers);
        ExcelUtil<ContactsGroupMembers> util = new ExcelUtil<ContactsGroupMembers>(ContactsGroupMembers.class);
        util.exportExcel(response, list, "通讯录成员数据");
    }

    /**
     * 获取通讯录成员详细信息
     */
    @PreAuthorize("@ss.hasPermi('emerduty:members:query')")
    @GetMapping(value = "/{memberId}")
    public AjaxResult getInfo(@PathVariable("memberId") Long memberId)
    {
        return AjaxResult.success(contactsGroupMembersService.selectContactsGroupMembersById(memberId));
    }

    /**
     * 新增通讯录成员
     */
    @PreAuthorize("@ss.hasPermi('emerduty:members:add')")
    @Log(title = "通讯录成员", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ContactsGroupMembers contactsGroupMembers)
    {
        return toAjax(contactsGroupMembersService.insertContactsGroupMembers(contactsGroupMembers));
    }

    /**
     * 修改通讯录成员
     */
    @PreAuthorize("@ss.hasPermi('emerduty:members:edit')")
    @Log(title = "通讯录成员", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ContactsGroupMembers contactsGroupMembers)
    {
        return toAjax(contactsGroupMembersService.updateContactsGroupMembers(contactsGroupMembers));
    }

    /**
     * 删除通讯录成员
     */
    @PreAuthorize("@ss.hasPermi('emerduty:members:remove')")
    @Log(title = "通讯录成员", businessType = BusinessType.DELETE)
	@DeleteMapping("/{memberIds}")
    public AjaxResult remove(@PathVariable Long[] memberIds)
    {
        return toAjax(contactsGroupMembersService.deleteContactsGroupMembersByIds(memberIds));
    }
}
