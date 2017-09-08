import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		int i,len;
		len=Student.length;
		for(i=0;i<len;i++)
		{
			System.out.println(Student[i]);
	    }
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		int i,len;
		len=Student.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+len+" students name");
		for(i=0;i<len;i++)
		{
		
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		int i,len;
		len=Student.length;
		if(index<len && index>=0)
		{
		for(i=0;i<len;i++)
		{
		 if(i==index)
         System.out.println(Student[i]);	
		}
		}	
        else
	    System.out.println("Array index out of bounds\n");
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		int i,len;
		len=Student.length;
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		int i,len;
		len=Student.length;
		if(index<len && index>=0)
		{
		for(i=0;i<len;i++)
		{
		 if(i==index)
		 {
			 Student.remove(index);
			 while(i<len)
			 Student[i]=Student[i+1];
		     
		 }
		}
		Student.remove(len-1);
	    }
		else
	    System.out.println("Array index out of bounds\n");
		 
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int i,j;
		String temp=new String[];
		for(i=0;i<Student.length;i++)
		{
			for(j=0;j<Student.length;j++)
			{
				if(((Student[i].fullName).compareTo(Student[j].fullName))>0)
				{
					temp=Student[i];
					Student[i]=Student[j];
					Student[j]=temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		int i,len;
		len=Student.length;
		for(i=0;i<len;i++)
		{
			if((Student[i].birthDate).compareTo(date)==0)
				System.out.println(Student[i]);
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
