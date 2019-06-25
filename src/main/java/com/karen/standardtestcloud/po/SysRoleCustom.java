package com.karen.standardtestcloud.po;

import java.util.List;


public class SysRoleCustom extends SysRole {

	// 权限
	private List<SysPermission> permissionList;

	public List<SysPermission> getPermissionList() {
		return permissionList;
	}

	public void setPermissionList(List<SysPermission> permissionList) {
		this.permissionList = permissionList;
	}

	@Override
	public String toString() {
		return "SysRoleCustom [permissionList=" + permissionList + "]";
	}

}
