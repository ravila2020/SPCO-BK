package mx.com.oneproject.spco.modelo;

import java.io.Serializable;

public class RolePermissionId implements Serializable {

	private Integer roleId;
	private Integer permissionId;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}
	


}
