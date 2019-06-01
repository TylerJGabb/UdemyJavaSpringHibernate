package testrunner.manager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestRunnerManagerConfig {
	
	//Default values are set within the annotations (don't know if i like that)
	@Value("${max.ssh.connections: 15}")
	private int maxSshConnections;

	@Value("${linux.vm.password}")
	private String linuxVmPassword;
	
	@Override
	public String toString() {
		return "TestRunnerManagerConfig [maxSshConnections=" + maxSshConnections + ", linuxVmPassword="
				+ linuxVmPassword + "]";
	}
}
