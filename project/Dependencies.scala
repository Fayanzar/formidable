import sbt._

object Dependencies {
  lazy val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "2.5.0"
  lazy val scalaParser = "org.scala-lang.modules" %% "scala-parser-combinators" % "2.5.0"
  lazy val jaxbApi = "javax.xml.bind" % "jaxb-api" % "2.3.0"
  lazy val dispatchV = "2.0.0"
  lazy val dispatch = "org.dispatchhttp" %% "dispatch-core" % dispatchV
}
