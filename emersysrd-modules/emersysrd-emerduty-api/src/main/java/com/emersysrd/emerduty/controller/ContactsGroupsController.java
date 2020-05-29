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
import com.emersysrd.emerduty.domain.ContactsGroups;
import com.emersysrd.emerduty.service.IContactsGroupsService;

import javax.servlet.http.HttpServletResponse;

/**
 * 通讯录分组Controller
 *
 * @author kim
 * @date 2020-05-28
 */
@RestController
@RequestMapping("groups")
public class ContactsGroupsController extends BaseController
{
    @Autowired
    private IContactsGroupsService contactsGroupsService;

    /**
     * 查询通讯录分组列表
     */
    @PreAuthorize("@ss.hasPermi('emerduty:groups:list')")
    @GetMapping("/list")
    public TableDataInfo list(ContactsGroups contactsGroups)
    {
        startPage();
        List<ContactsGroups> list = contactsGroupsService.selectContactsGroupsList(contactsGroups);
        return getDataTable(list);
    }

    /**
     * 导出通讯录分组列表
     */
    @PreAuthorize("@ss.hasPermi('emerduty:groups:export')")
    @Log(title = "通讯录分组", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public void export(HttpServletResponse response, ContactsGroups contactsGroups) throws IOException
    {
        List<ContactsGroups> list = contactsGroupsService.selectContactsGroupsList(contactsGroups);
        ExcelUtil<ContactsGroups> util = new ExcelUtil<ContactsGroups>(ContactsGroups.class);
        util.exportExcel(response, list, "通讯录分组数据");
    }

    /**
     * 获取通讯录分组详细信息
     */
    @PreAuthorize("@ss.hasPermi('emerduty:groups:query')")
    @GetMapping(value = "/{groupId}")
    public AjaxResult getInfo(@PathVariable("groupId") Long groupId)
    {
        return AjaxResult.success(contactsGroupsService.selectContactsGroupsById(groupId));
    }

    /**
     * 新增通讯录分组
     */
    @PreAuthorize("@ss.hasPermi('emerduty:groups:add')")
    @Log(title = "通讯录分组", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ContactsGroups contactsGroups)
    {
        return toAjax(contactsGroupsService.insertContactsGroups(contactsGroups));
    }

    /**
     * 修改通讯录分组
     */
    @PreAuthorize("@ss.hasPermi('emerduty:groups:edit')")
    @Log(title = "通讯录分组", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ContactsGroups contactsGroups)
    {
        return toAjax(contactsGroupsService.updateContactsGroups(contactsGroups));
    }

    /**
     * 删除通讯录分组
     */
    @PreAuthorize("@ss.hasPermi('emerduty:groups:remove')")
    @Log(title = "通讯录分组", businessType = BusinessType.DELETE)
	@DeleteMapping("/{groupIds}")
    public AjaxResult remove(@PathVariable Long[] groupIds)
    {
        return toAjax(contactsGroupsService.deleteContactsGroupsByIds(groupIds));
    }
}
