name := "tdd"

resolvers in ThisBuild ++= Seq("Maven Repository" at "http://maven.apache.org/")

libraryDependencies ++= Seq(
	"junit" 		% 	"junit" 			% 	"4.12" % "test",
	"com.novocode" 	% 	"junit-interface" 	% 	"0.11" % Test
)