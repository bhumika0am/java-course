package date18oct;

public class Test {

	void registerStudent(Student st) {
		System.out.println("Name: "+st.getName()+"\nCourse: "+st.getCourse()+"\nId: "+st.getId());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setName("Darshan");
		s.setCourse("MCA");
		s.setId(1);
		Test t=new  Test();
		t.registerStudent(s);

	}

}
