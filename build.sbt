name := """myscala"""

version := "1.0"

scalaVersion := "2.11.0"

// set the main class for 'sbt run'
mainClass in (Compile, run) := Some("com.jpreddy.scala.ScalaCookBookStringsDriver")

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.1.3" % "test"

libraryDependencies ++= Seq("org.slf4j" % "slf4j-api" % "1.7.5","org.slf4j" % "slf4j-simple" % "1.7.5")
