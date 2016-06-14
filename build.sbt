name := "redbucks"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"