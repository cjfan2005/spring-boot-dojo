package spring.boot.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import spring.boot.practice.dto.DeptUserDto;
import spring.boot.practice.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

	@Query("SELECT d.name, u.name, u.email FROM Department d LEFT JOIN d.user u")
	List<DeptUserDto> fetchUserDeptDataLeftJoin();
	
	@Query("SELECT d.name, u.name, u.email FROM Department d RIGHT JOIN d.user u")
    List<DeptUserDto> fetchUserDeptDataRightJoin();
}
