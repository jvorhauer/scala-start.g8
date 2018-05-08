// build definition for this giter8 template
lazy val root = (project in file("."))
  .settings(
    name := "scala-start",
    test in Test := {
      val _ = (g8Test in Test).toTask("").value
    },
    scriptedLaunchOpts ++= List("-Xms1g", "-Xmx1g", "-XX:ReservedCodeCacheSize=128m", "-Dfile.encoding=UTF-8"),
    resolvers += Resolver.typesafeIvyRepo("releases"),
    scalaVersion := "2.12.6"
  )