package com.cucumber.pbsm;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(
		format = {"pretty",
				"html:target/html/"
			//	"json:target_json/cucumber.json"
				//"junit:taget_junit/cucumber.xml"
				},
		
		features =	"src/test/resource",
		
				tags = {"@PBSLogin, @PBSLanding"}
		//@brainlogin , 
		//, @olrlogin"
				//, @Olrvalidation
				// "~@wip", "~@notImplemented","@executeThis"},
				//"@Login, @CourseCreation,
		//monochrome = true,
		
		)
public class RunnerTest {

}
