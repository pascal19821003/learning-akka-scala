name := "Akka Cluster"

version := "1.0"

scalaVersion := "2.11.8"

sbtVersion := "0.13.8"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.6",
  "com.typesafe.akka" %% "akka-remote" % "2.4.6",
  "com.typesafe.akka" %% "akka-cluster" % "2.4.6",
  "com.typesafe.akka" %% "akka-cluster-tools" % "2.4.6",
  "com.typesafe.akka" %% "akka-cluster-sharding" % "2.4.6",
  "com.typesafe.akka" %% "akka-persistence" % "2.4.6",
  "com.typesafe.akka" %% "akka-contrib" % "2.4.6",
  "org.iq80.leveldb" % "leveldb" % "0.7",
  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8")