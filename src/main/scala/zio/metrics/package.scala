package zio

package object metrics {
  import scalaz.{Cord, Show}
  implicit def showClass[A] = new Show[Class[A]] {
    override def show(f: Class[A]): Cord = Cord(f.getName())
    override def shows(f: Class[A]): String = show(f).toString()
  }
}