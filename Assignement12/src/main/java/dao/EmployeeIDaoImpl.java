package dao;

import java.util.ArrayList;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import config.SessionUtil;
import model.Employee;

public class EmployeeIDaoImpl implements EmployeeDao{

	private Session s;
	private Transaction t;
	private Query q;
	public EmployeeIDaoImpl() {
		s = SessionUtil.getSession();
		t = s.beginTransaction();
	}

	public Employee findEmployeeById(int id) {
		try {
		s = SessionUtil.getSession();
		q = s.createQuery("from Employee where id =:id");
		q.setParameter("id",id);
		Employee e = (Employee) q.getSingleResult();
		s.close();
		return e ;
		}catch(NoResultException r) {
			System.err.println("Employee with id "+id+" does not exist");
			return null;
		}
	}

	public Employee saveEmployee(Employee e) {
		s = SessionUtil.getSession();
		s.save(e);
		s.close();
		return e;
	}

	public Employee deleteEmployee(int id) {
		Employee e = findEmployeeById(id);
		if(e!=null) {
			
		
		 s = SessionUtil.getSession();
		 t = s.beginTransaction();
		 Query qu  = s.createQuery("delete Employee where id = :id");
			qu.setParameter("id",id);
		 int succsess = qu.executeUpdate();
		 t.commit();
		 if(succsess>0) {
			 return  e;
		 }
		}
		return null;
	}

	public Employee updateEmployee(Employee e) {
		
		s = SessionUtil.getSession();
		t = s.beginTransaction();
		s.update(e);
		t.commit();
		s.close();
		return e;
	}

	public ArrayList<Employee> findAllEmployee() {
		s = SessionUtil.getSession();
		ArrayList<Employee>employees= (ArrayList<Employee>) s.createQuery("from Employee").list();
		return employees;
	}
	
	
}
