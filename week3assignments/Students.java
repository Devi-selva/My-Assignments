package week3assignments;

public class Students {
	
	public void getStudentInfo(int Id)
	{
		System.out.println("Student info is :"+ Id);
	}
	
	public void getStudentInfo(int Id, String Name)
	{
		System.out.println("Student info is :"+ Id+Name);
	}
	
	public void getStudentInfo(int Id, String Name, String email,long Phone)
	{
		System.out.println("Student info is :"+ Id+Name+email+Phone);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students st= new Students();
		st.getStudentInfo(11);
		st.getStudentInfo(11, "Devi");
		st.getStudentInfo(11, "Devi", "testleaf@gmail.com", 872626626262l);

	}

}
