package onlinebookstore

abstract class Category(private val name:String) {
//    2. Categories:
//- Create an abstract class `Category` with the property `name` (String) and an abstract function `displayCategory()`.
//- Implement two subclasses: `FictionCategory` and `NonFictionCategory`. Each subclass should implement the `displayCategory()` function to display the specific category type.
    abstract fun displayCategory()
}