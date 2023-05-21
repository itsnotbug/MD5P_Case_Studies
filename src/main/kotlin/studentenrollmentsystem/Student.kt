package studentenrollmentsystem
//    Student ID
//    Name
//    Age
//    Gender
//    Contact Information (phone number and email address)
//    List of enrolled courses
class Student(private var studentID:Int,
              private var name:String,
              private var age:Int,
              private var gender:String,
              private var phoneNumber:Long,
              private var email:String,
              private var listOfEnrolledCourses:MutableList<String>) {

    fun setStudentID(studentID:Int){
        this.studentID =studentID

    }
    fun setName(name:String){
        this.name=name
    }
    fun setAge(age:Int){
        this.age=age
    }
    fun setGender(gender:String){
        this.gender=gender
    }
    fun setPhoneNumber(phoneNumber:Long){
        this.phoneNumber=phoneNumber
    }
    fun setEmail(email:String){
        this.email =email
    }
    fun setLisOfEnrolledCourses(listOfEnrolledCourses:MutableList<String>){
        this.listOfEnrolledCourses =listOfEnrolledCourses
    }

    fun getStudentId():Int{
        return studentID
    }
    fun getName():String{
        return name
    }
    fun getAge():Int{
        return age
    }
    fun getPhoneNumber():Long{
        return phoneNumber
    }

    fun getGender():String{
        return gender
    }
    fun getEmail():String{
        return email
    }

    fun getListOfEnrolledCourses():MutableList<String>{
        return listOfEnrolledCourses
    }

    //Add a method to enroll the student in a course.
    //Add a method to withdraw the student from a course.
    //Add a method to generate a report of all courses the student is enrolled in.
    fun enrollStudent(student:Student,course:String) {
        student.listOfEnrolledCourses.add(course)
        println("Enrolled in $course")
    }
    fun withdrawStudent(student: Student,course: String){
        student.listOfEnrolledCourses.remove(course)
        println("Withdrawn from $course")
    }

    fun generateReportForStudentsEnrolled(student: Student){
        println("Student ID: ${student.getStudentId()}")
        println("Student Name: ${student.getName()}")
        println("Student Age: ${student.getAge()}")
        println("Contact Information: ${student.getPhoneNumber()} (contact number) and ${student.getEmail()}(email)")
        println("List of enrolled courses: ")
        for (courses in student.getListOfEnrolledCourses()) {
            println(courses)
        }
    }
}
