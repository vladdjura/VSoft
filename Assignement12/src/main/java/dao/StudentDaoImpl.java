package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;

import config.SessionUtil;
import model.Student;
@Transactional
public class StudentDaoImpl implements StudentDao{
	private Session ses = SessionUtil.getSession();
    private Transaction tx = ses.beginTransaction();
	public ArrayList<Student> findAllStudents() {
		
		ses = SessionUtil.getSession();
        Query query = ses.createQuery("from Student");
        ArrayList<Student> students = (ArrayList<Student>) query.getResultList();
        ses.close();
		
		return students;
	}

	public Student findStudentById(int id) {
		try {
		ses = SessionUtil.getSession();
		Query q = ses.createQuery("from Student where id =:id ");
		q.setParameter("id",id);
		Student s = (Student) q.getSingleResult();
		ses.close();
		return s;
		}
		catch(NoResultException e) {
			System.err.println("student with id =" + id+" does not exist");
			return null;
		}
	}

	public Student saveStudent(Student s) {
		ses = SessionUtil.getSession();
		if(s!=null) {
			ses.save(s);
			
		}
		ses.close();
		return s;
	}

	public Student deleteStudentById(int id) {
		Student s = findStudentById(id);
		if(s!=null) { 
		ses = SessionUtil.getSession();
		tx = ses.beginTransaction();
		Query q  = ses.createQuery("delete Student where id = :id");
		q.setParameter("id",id);
		int success = q.executeUpdate();
		tx.commit();
		if(success > 0) {
			return s;
		}
		return null;
	}
		return null;	
	}
	public Student updateStudent(Student s) {
		System.err.println(s.toString());
		ses = SessionUtil.getSession();
		tx = ses.beginTransaction();
		ses.update(s);
		tx.commit();
		ses.close();
		
		return s;
		
	}

	
}
