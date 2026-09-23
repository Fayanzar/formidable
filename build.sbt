import Dependencies._

val scala3Version = "3.9.0"

lazy val root = (project in file("."))
  .enablePlugins(sbtscalaxbchoice.ChoiceScalaxbPlugin)
  .settings(
    name := "formidable",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.3.6" % Test,
    libraryDependencies += "org.scalaxb" %% "scalaxb" % "1.12.5",
    libraryDependencies ++= Seq(dispatch, scalaXml, scalaParser, jaxbApi),
	
    Compile / choiceScalaxbXsdSource := baseDirectory.value / "src" / "main" / "xsd",
    Compile / choiceScalaxbPackageName := "irs.mef",
  )
