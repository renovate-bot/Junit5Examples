package com.howtodoinjava.junit5.examples;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
// 1- defined tested package
@SelectPackages("my.package")

// 2- je veux inclure le tag "development"
@IncludeTags("development")
public class DevelopmentTests
{
}
