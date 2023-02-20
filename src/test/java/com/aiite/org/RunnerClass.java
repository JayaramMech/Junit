package com.aiite.org;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.aiite.HomePageexe;
import com.aiite.LoginPage;

@RunWith(Suite.class)
@SuiteClasses({HomePageexe.class,LoginPage.class})
public class RunnerClass {

	public static void main(String[] args) {
		Result res=JUnitCore.runClasses(HomePageexe.class,LoginPage.class);

	}

}
