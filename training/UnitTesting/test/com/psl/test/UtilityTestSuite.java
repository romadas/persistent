package com.psl.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)//for combining different test class
@SuiteClasses(value={UtilityTest.class,ParameterizedTest.class})
public class UtilityTestSuite {

}
