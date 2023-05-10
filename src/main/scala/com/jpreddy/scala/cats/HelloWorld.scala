package com.jpreddy.scala.cats

import cats.effect.{IO, IOApp}

object HelloWorld extends IOApp.Simple {
  val run = IO.println("Hello, World!")
}
