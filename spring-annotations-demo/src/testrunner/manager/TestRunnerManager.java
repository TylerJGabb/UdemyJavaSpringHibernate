package testrunner.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestRunnerManager {
	
	@Autowired
	private TestRunnerManagerConfig oConfig;

	@Override
	public String toString() {
		return "TestRunnerManager [oConfig=" + oConfig + "]";
	}
	
	
}
