package Highlight;

	import java.time.LocalDate;
	import java.util.List;
	import java.util.ArrayList;

	// TODO encapsulate TLAClass class
	// - List<String> is mutable object list do not return original reference.
	// - provide setters and getters for each instance variables.
	// - in the listOfStudents setter method, if input list contains null or empty string throw IllegalArgumentException
	public class Encapsulation {
	    private String currentCourse;
	    private List<String> listOfStudents;
	    private int lengthOfCourse;
	    private LocalDate completionDate;
	  
	  public List<String> getListOfStudents(){
	    List<String> copyOfListOfStudents = new ArrayList<>(listOfStudents);
	    return copyOfListOfStudents;
	  }
	  public void setListOfStudents (List<String>listOfStudents){
	    for(String student: listOfStudents){
	      if (student==null||student.equals("")){
	        throw new IllegalArgumentException();
	      }
	    }
	    this.listOfStudents = new ArrayList<>(listOfStudents);
	  }

	  public String getCurrentCourse(){
	    return currentCourse;
	  }
	  public void setCurrentCourse(String currentCourse){
	    this.currentCourse = currentCourse;
	  }
	  
	  public int getLengthOfCourse(){
	    return lengthOfCourse;
	  }
	  public void setLengthOfCourse(int lengthOfCourse){
	    this.lengthOfCourse = lengthOfCourse;
	  }
	  
	  public LocalDate getCompletionDate(){
	    return completionDate;
	  }
	  public void setCompletionDate (LocalDate completionDate){
	    this.completionDate = completionDate;
	  } 
	}
