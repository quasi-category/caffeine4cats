organization := "io.github.yaroot"
name := "caffeine4cats"
scalaVersion := "2.13.3"
crossScalaVersions := Seq("2.12.12", "2.13.3")

fork in run := true
addCompilerPlugin("org.typelevel"    % "kind-projector"     % "0.11.2" cross CrossVersion.full)
addCompilerPlugin("com.olegpy"      %% "better-monadic-for" % "0.3.1" cross CrossVersion.binary)
addCompilerPlugin("com.github.cb372" % "scala-typed-holes"  % "0.1.6" cross CrossVersion.full)

testFrameworks += new TestFramework("munit.Framework")
scalafmtOnCompile := true
cancelable in Global := true

libraryDependencies ++= Seq(
  "org.typelevel"                %% "cats-effect" % "2.3.1",
  "com.github.ben-manes.caffeine" % "caffeine"    % "2.8.8",
  "org.scalameta"                %% "munit"       % "0.7.20" % Test
)

version ~= (_.replace('+', '-'))
dynver ~= (_.replace('+', '-'))
