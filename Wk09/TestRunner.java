package Wk09;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(RandomCharacterTest.class);
		
      System.out.println(result.wasSuccessful());
   }
}
