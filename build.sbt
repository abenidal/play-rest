name := """play-rest"""
organization := "com.example"

version := "1.0-SNAPSHOT"



lazy val root = (project in file(".")).enablePlugins(PlayJava)




scalaVersion := "2.13.8"

libraryDependencies += guice
libraryDependencies +="io.jsonwebtoken" % "jjwt" % "0.9.0"

