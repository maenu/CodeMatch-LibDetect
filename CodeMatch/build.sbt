scalaVersion := "2.12.4"
//logLevel := Level.Debug
name := "codematch"
//javacOptions += "-verbose"
//javaOptions += "-verbose"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
        
libraryDependencies ++= Seq(
                    "de.opal-project" % "abstract-interpretation-framework_2.12" % "1.1.0-SNAPSHOT" withSources() withJavadoc(),
                    "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test"
                    )
