import Dependencies._
//import Dependencies.{scalaTest, _}
//import sbt.Keys.baseDirectory
//import sbt._
//
//
//name := "scala-snippets"
//organization := "com.jpreddy"
//
//scalaVersion := "3.1.3"
//autoScalaLibrary := false
//val ver = "1.0.0"
//version :=  ver
//
//
////unmanagedResourceDirectories in Test += baseDirectory.value / "conf"
////unmanagedResourceDirectories in Compile += baseDirectory.value / "conf"
//
////val testConcurrency = 10
////parallelExecution in Test := true
////concurrentRestrictions in Global := Seq(Tags.limitAll(testConcurrency))
////build info
//
//
////sourceGenerators in Compile <+= buildInfo
////buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion)
////
////coverageExcludedPackages := "au\\.com\\.apraamcos\\.idap\\.lambda.*"
//
////addCommandAlias(
////  "build-all",
////  ";clean ;file_format/clean ;lambdas/clean ;dependencies/clean ;compile ;copyResources ; test:copyResources ;file_format/copyResources ;file_format/test:copyResources ;coverage ;test ;coverageAggregate ;coverageOff ;common/package ;file_format/package ;lambdas/assembly ;dependencies/assembly ;moveToDeploy"
////)
////addCommandAlias("citest", ";clean ;coverage ;test ;coverageAggregate")
////
////addCommandAlias("cc", ";lambdas/clean ;lambdas/test ;lambdas/jacoco")
////
////addCommandAlias("br", ";copyResources ; test:copyResources ;file_format/copyResources ;file_format/test:copyResources")
////
////addCommandAlias("tnf", ";br; runMain au.com.apraamcos.idap.util.TransformationMappingUtil")
//
//
//////git
////showCurrentGitBranch
////git.useGitDescribe := true
////git.baseVersion := version.value.toString()
////git.formattedShaVersion := git.gitHeadCommit.value map{ sha =>
////  val head = sha.substring(0, 10)
////  //  val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd")
////  //  val date = java.time.LocalDate.now.format(formatter).toString
////  //  s"$ver-$date-$head"
////  s"$ver-$head"
////}
////val VersionRegex = "v([0-9]+.[0-9]+.[0-9]+)-?(.*)?".r
////git.gitTagToVersionNumber := {
////  case VersionRegex(v,"") => Some(v)
////  case VersionRegex(v,"SNAPSHOT") => Some(s"$v-SNAPSHOT")
////  case VersionRegex(v,s) => Some(s"$v-$s-SNAPSHOT")
////  case _ => None
////}
//
//
//javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")
//
//lazy val commonSettings = Seq(
//  scalaVersion := "3.1.3",
//  resolvers ++= Seq(
//    Resolver.sonatypeRepo("releases"),
//    "aws-glue-etl-artifacts" at "https://aws-glue-etl-artifacts.s3.amazonaws.com/release/",
//    "Typesafe Releases" at "https://repo.typesafe.com/typesafe/releases/",
//    "Artima Maven Repository" at "https://repo.artima.com/releases"
//  )
//)
//
//lazy val root = (project in file("."))
//  .settings(commonSettings: _*)
//  .settings(
//    name := "scala-snippets",
//    scalacOptions ++= Seq("-encoding", "UTF-8"),
////    unmanagedResourceDirectories in Compile += baseDirectory.value  / "conf",
////    unmanagedResourceDirectories in Test += baseDirectory.value / "conf",
//    outputStrategy        :=   Some(StdoutOutput),
//    libraryDependencies ++= Seq(
////      awsS3 % "compile",
////      awsGlueEtl % "compile",
////      awsSecretsManager % "compile",
////      log4jCore % "compile",
////      //          pegdown,
////      //          postgresql,
////      //          scalikeJdbc,
////      scalaCompiler % "compile",
////      snowflakeJdbc % "compile",
////      sparkCore % "compile",
////      sparkSql % "compile",
////      sparkSnowflake % "compile",
////      sparkExcel % "compile",
////      juniversalChardet ,
////      typesafeConfig,
////      flexmark,
////      pegdown,
//      catsEffect,
//      scalaTest
//    )
//  )
//
//
////fork in ThisBuild := true
////parallelExecution in ThisBuild := false
////logBuffered in ThisBuild := false
////testOptions in ThisBuild ++=
////  Seq(
////    Tests.Argument(TestFrameworks.ScalaTest, "-oSD"),
////    Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports")
////  )
////
////
////javaOptions ++= Seq(
////  "-XX:+CMSClassUnloadingEnabled",
////  "-XX:MaxMetaspaceSize=512M",
////  "-XX:MetaspaceSize=256M",
////  "-Xms512M",
////  "-Xmx2G",
////  "-XX:MaxPermSize=2048M"
////)
////
////
////cleanFiles += baseDirectory.value / "deploy"
//
//



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
