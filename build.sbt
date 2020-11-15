import scala.sys.process.Process

name := """play-vuejs-sandbox"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

PlayKeys.playRunHooks += baseDirectory.map(PlayDevRunHook.apply).value

lazy val frontEndBuild = taskKey[Unit]("Execute dashboard frontend build command")

val frontendPath = "frontend"
val frontEndFile = file(frontendPath)

frontEndBuild := {
  val logger = streams.value.log
  logger.info(s"Building dashboard frontend in $frontendPath")
  println(Process("yarn install", frontEndFile).!!)
  println(Process("yarn build", frontEndFile).!!)
}

dist := (dist dependsOn frontEndBuild).value
stage := (stage dependsOn dist).value

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
