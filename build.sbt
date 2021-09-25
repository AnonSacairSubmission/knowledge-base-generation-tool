scalaVersion := "2.13.6"

name := "kbgt"
version := "1.0"

Compile / doc / scalacOptions := Seq("-groups", "-implicits")

libraryDependencies += "com.github.scopt" % "scopt_2.13" % "4.0.1"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.9"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"
