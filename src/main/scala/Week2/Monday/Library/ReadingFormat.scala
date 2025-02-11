package Week2.Monday.Library

class ReadingFormat

trait AudioBook extends ReadingFormat

trait DigitalBook extends ReadingFormat

trait PhysicalBook extends ReadingFormat

//extending a class using keyword extends. We can only extend one class per 'thing' (object, trait, class)

//by having each format extending the superclass/parent class 'ReadingFormat', we are grouping these together
// and giving each trait access to any method within the parent class.
