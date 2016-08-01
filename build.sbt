name := "Cake Pattern Example"

version := "0.0.0"

scalaVersion := "2.11.8"

libraryDependencies ++= {
	Seq(
		"org.typelevel" %% "cats" % "0.6.1",
		"org.scalaz" %% "scalaz-core" % "7.3.0-M4",
		"org.scalactic" %% "scalactic" % "3.0.0-RC4",
		"org.scalatest" %% "scalatest" % "3.0.0-RC4" % "test"
	)
}

scalacOptions ++= Seq("-unchecked", "-deprecation")

