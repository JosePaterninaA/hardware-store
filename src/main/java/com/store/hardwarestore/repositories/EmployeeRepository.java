package com.store.hardwarestore.repositories;

import com.store.hardwarestore.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
