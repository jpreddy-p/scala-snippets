import Dependencies._

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-snippets",
    description := "Example sbt project that compiles using Scala 3",
    version := "0.1.0",
    scalaVersion := "3.2.2",
    scalacOptions ++= Seq("-deprecation"),
    libraryDependencies ++= Seq(
        catsEffect,
        scalaMeta
    )
  )
