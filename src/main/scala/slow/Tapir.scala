package slow

import sttp.tapir._

case class Foo(a: Int)

object Main extends App {
  val a = implicitly[Schema[Foo]]
    .modify(_.a)(_.description("foo")) // 1s with silencer and 1s without
    .modify(_.a)(_.description("foo")) // 1s with silencer and 1s without
    .modify(_.a)(_.description("foo")) // 1s with silencer and 1s without
    .modify(_.a)(_.description("foo")) // 1s with silencer and 1s without
    .modify(_.a)(_.description("foo")) // 1s with silencer and 1s without
    .modify(_.a)(_.description("foo")) // 1s with silencer and 1s without
    .modify(_.a)(_.description("foo")) // 1s with silencer and 1s without
    .modify(_.a)(_.description("foo")) // 1s with silencer and 1s without
    .modify(_.a)(_.description("foo")) // 1s with silencer and 1s without
    .modify(_.a)(_.description("foo")) // 1s with silencer and 1s without
    .modify(_.a)(_.description("foo")) // 2s with silencer and 1s without
    .modify(_.a)(_.description("foo")) // 6s with silencer and 1s without
    .modify(_.a)(_.description("foo")) // 16s with silencer and 1s without
    .modify(_.a)(_.description("foo")) // 25s with silencer and 1s without

}