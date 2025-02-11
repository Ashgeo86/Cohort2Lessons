package Week2.Monday.Library

trait Genre {
  def enjoy: String = "Enjoy your book"
}

trait Fantasy extends Genre {
  // this means the trait Fantasy can access the enjoy method above
  override def enjoy: String = "Enjoy your fantasy book"
  //this allows it to override the enjoy string and write a new one
}

trait Thriller extends Genre
trait Horror extends Genre