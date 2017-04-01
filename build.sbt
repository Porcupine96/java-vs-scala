name := "java-vs-scala"
version := "0.1"
scalaVersion := "2.12.1"

val jUnitVersion = "4.11"
val scalaTestVersion = "3.0.1"
val akkaVersion = "2.4.17"
val akkaHttpVersion = "10.0.5"
val akkaJson4sVersion = "1.11.0"
val json4sVersion = "3.5.0"

val javaDependencies = Seq(
  "junit" % "junit" % jUnitVersion
)

val scalaDependencies = Seq(
  "org.scalatest" % "scalatest_2.12" % scalaTestVersion,
  "com.typesafe.akka" % "akka-actor_2.12" % akkaVersion,
  "com.typesafe.akka" % "akka-http_2.12" % akkaHttpVersion,
  "de.heikoseeberger" %% "akka-http-json4s" % akkaJson4sVersion,
  "org.json4s" %% "json4s-native" % json4sVersion,
  "org.json4s" %% "json4s-core" % json4sVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % "test"
)

libraryDependencies ++= javaDependencies
libraryDependencies ++= scalaDependencies


resolvers ++= Seq(
  "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"
)