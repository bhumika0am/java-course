package date18oct;

public class Student implements java.io.Serializable {

		/**
		 * 
		 */
		String name;
		private int id;
		private String course;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		
}