package com.actitime.testscript;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule extends BaseClass
{
@Test
public void testCreateCustomer() {
	Reporter.log("Create Customer",true);
	Assert.fail();
}
}
