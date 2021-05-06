package com.howtodoinjava.junit5.examples;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
// 1- selectionné le package principale
@SelectPackages("my.package")
// 2- inclure le package C
@IncludePackages("packageC")
// 3- exclure prod
@ExcludeTags("PROD")
public class JUnit5TestSuite {

}
