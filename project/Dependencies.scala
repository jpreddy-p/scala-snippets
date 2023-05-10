import sbt.Keys.libraryDependencies
import sbt._

object Dependencies {
  val scalaVersionNumber = "3.2.2"

  private object versions {


    val scalaTest           = "3.2.15"
    val catsEffect          = "3.4.10"
    val scalaMeta           = "0.7.29"

  }


  val scalaTest                =  "org.scalatest"                    %% "scalatest"                    % versions.scalaTest % Test
  val catsEffect               =  "org.typelevel"                    %% "cats-effect"                  % versions.catsEffect
  val scalaMeta                =  "org.scalameta"                    %% "munit"                        % versions.scalaMeta % Test

}
