name := "Testing"

version := "1.0"

scalaVersion := "2.11.8"

sbtVersion := "0.13.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.6",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.6" % "test")