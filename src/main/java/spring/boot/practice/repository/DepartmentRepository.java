package spring.boot.practice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import spring.boot.practice.dto.DeptUserDto;
import spring.boot.practice.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

	List<DeptUserDto> fetchUserDeptDataLeftJoin();
	
	
    List<DeptUserDto> fetchUserDeptDataRightJoin();
}
