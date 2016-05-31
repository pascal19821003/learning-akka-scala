name := "Persistence"

version := "1.0"

scalaVersion := "2.11.8"

sbtVersion := "0.13.8"

libraryDependencies ++= Seq(
  	"com.typesafe.akka"           %% "akka-actor"       % "2.4.6",
  	"com.typesafe.akka"           %% "akka-persistence" % "2.4.6",
    "com.typesafe.akka"           %% "akka-slf4j" % "2.4.6",
    "ch.qos.logback"           % "logback-classic" % "1.1.3",
  	"org.iq80.leveldb"            % "leveldb"           % "0.7",
  	"org.fusesource.leveldbjni"   % "leveldbjni-all"    % "1.8",
	"com.github.dnvriend" %% "akka-persistence-jdbc" % "2.2.23",
	"mysql" % "mysql-connector-java" % "5.1.38"
)