package studentenrollmentsystem
fun main(){
    //Add methods to add a new student, remove a student, and enroll/withdraw a student from a course.
    //Add methods to generate reports of enrolled students in a course and courses a student is enrolled in.

    val courses = mutableListOf<String>("Algebra","Business and Communication ","COMP101")
    val student = Student(123,"Bernadette de Jesus",24,"Female",639771634684,"bernadettedejesus99@gmail.com",courses)
    student.enrollStudent(student,"Psychology")
    student.withdrawStudent(student,courses[2])
    println("----------------------------------Generate Report----------------------------------------------")
    student.generateReportForStudentsEnrolled(student)
    println()
    val enrolledStudent = mutableListOf<String>("Bernadette")
    val anotherStudent ="Alan"
    val course =Course(1501,"Foreign Language 101","Rose de Guzman",25,enrolledStudent)
    course.enrollStudentInTheCourse(course,enrolledStudent[0])
    course.enrollStudentInTheCourse(course,anotherStudent)
    course.removeStudentFromTheCourse(course,enrolledStudent[0])
    println("----------------------------------Generate Report----------------------------------------------")
    course.generateReportOfStudentsEnrolled(course)
}