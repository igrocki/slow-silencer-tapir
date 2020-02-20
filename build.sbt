name := "slow-silencer-tapir"

version := "0.1"

scalaVersion := "2.13.1"

lazy val silencerVersion = "1.5.0"
val tapirVersion = "0.12.21"

lazy val silencer = Seq(
  compilerPlugin("com.github.ghik" %% "silencer-plugin" % silencerVersion cross CrossVersion.full),
  "com.github.ghik" %% "silencer-lib" % silencerVersion % Provided cross CrossVersion.full,
)

lazy val tapir = Seq(
  "com.softwaremill.sttp.tapir" %% "tapir-core" % tapirVersion,
)

libraryDependencies ++= (silencer ++ tapir)
