package ai.jobiak.collections;
import java.lang.*;

public class Course implements Comparable{
	private String courseId;
	private String courseName;
	private int courseDuration;
	private int courseCost;
	public Course(String courseId, String courseName, int courseDuration, int courseCost) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseCost = courseCost;
	}
		// TODO Auto-generated constructor stub
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	public int getCourseCost() {
		return courseCost;
	}
	public void setCourseCost(int courseCost) {
		this.courseCost = courseCost;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", courseCost=" + courseCost + "]";
	}
	@Override
	public int compareTo(Object o)
	{
		Course ref=(Course)o;
		if(this.courseId.compareTo(ref.getCourseId())<0) 
			return -1;
		
		else if(this.courseId.compareTo(ref.getCourseId())==0) 
			return 0;
		
		else if(this.courseId.compareTo(ref.getCourseId())>0) 
			return 1;
		
	
		
	}
  
}
