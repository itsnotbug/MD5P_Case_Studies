package onlinebookstore

abstract class User(private var name:String,private var email:String) {
    //4. Users:
    //- Create a class `User` with properties `name` (String) and `email` (String).
    //- Implement functions to get and set the properties, as well as a function to display user details (`displayUser()`).
//    private var name:String
//    private var email:String
//
//    init{
//        name=""
//        email=""
//    }
    fun setName(name:String){
        this.name=name
    }
    fun setEmail(email:String){
        this.email=email
    }

    abstract fun displayUser()

}