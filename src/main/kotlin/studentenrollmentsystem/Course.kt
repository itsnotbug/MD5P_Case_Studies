package studentenrollmentsystem
//Course ID
//Course Name
//Instructor Name
//Maximum number of students allowed
//List of enrolled students

class Course(private var courseId:Int,
             private var courseName:String,
             private var instructorName:String,
             private var maxNumberOfAllowedStudents:Int,
             private var listOfEnrolledStudents: MutableList<String>
) {

    fun setCourseId(courseId:Int){
        this.courseId =courseId
    }
    fun setCourseName(courseName:String){
        this.courseName =courseName
    }
    fun setInstructorName(instructorName:String){
        this.instructorName =instructorName
    }

    fun setMaxNumberOfAllowedStudents(maxNumberOfAllowedStudents:Int){
        this.maxNumberOfAllowedStudents =maxNumberOfAllowedStudents
    }
    fun setListOfEnrolledStudents(listOfEnrolledStudents:MutableList<String>){
        this.listOfEnrolledStudents =listOfEnrolledStudents
    }

    fun getCourseId():Int{
        return courseId
    }
    fun getCourseName():String{
        return courseName
    }

    fun getMaxNumberOfAllowedStudents():Int{
        return maxNumberOfAllowedStudents
    }

    fun getListOfEnrolledStudents():MutableList<String>{
        return listOfEnrolledStudents
    }

//    Add a method to enroll a student in the course.
//    Add a method to remove a student from the course.
//    Add a method to generate a report of all students enrolled in the course.

    fun enrollStudentInTheCourse(course:Course,student: String){
        course.listOfEnrolledStudents.add(student)


    }
    fun removeStudentFromTheCourse(course:Course,student: String){
        course.listOfEnrolledStudents.remove(student)

    }

    fun generateReportOfStudentsEnrolled(course: Course){
        println("Course ID: ${course.getCourseId()}")
        println("Course Name: ${course.getCourseName()}")
        println("Max of Allowed Students: ${course.getMaxNumberOfAllowedStudents()}")
        println("Instructor Name: ${course.getMaxNumberOfAllowedStudents()}")
        println("List of Students:")
        for (student in course.getListOfEnrolledStudents()) {
            println(student)
        }
    }

}