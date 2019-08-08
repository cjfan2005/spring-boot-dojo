package spring.boot.practice.dto;

public class DeptUserDto {
	
	private Long userId;
	private long deptId;
	private String name;
	private String email;
	private String deptName;
	
	public DeptUserDto(long userId, long deptId, String name, String email, String deptName) {
		this.userId = userId;
		this.deptId = deptId;
		this.name = name;
		this.email = email;
		this.deptName = deptName;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public long getDeptId() {
		return deptId;
	}
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}
